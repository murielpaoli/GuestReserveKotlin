package com.betrybe.trybnb.ui.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.betrybe.trybnb.R
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.HttpException
import java.io.IOException
import com.betrybe.trybnb.data.api.ApiClient
import com.betrybe.trybnb.data.models.AuthRequest
import com.betrybe.trybnb.common.ApiIdlingResource
import com.google.android.material.snackbar.Snackbar

class ProfileFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        val loginInputLayout = view.findViewById<TextInputLayout>(R.id.login_input_profile)
        val loginEditText = view.findViewById<TextInputEditText>(R.id.login_input_profile_edit_text)
        val passwordInputLayout = view.findViewById<TextInputLayout>(R.id.password_input_profile)
        val passwordEditText = view.findViewById<TextInputEditText>(R.id.password_input_profile_edit_text)
        val loginButton: Button = view.findViewById(R.id.login_button_profile)

        loginButton.setOnClickListener {
            val loginText = loginEditText.text.toString()
            val passwordText = passwordEditText.text.toString()

            var isValid = true

            if (loginText.isEmpty()) {
                loginInputLayout.error = "O campo Login é obrigatório"
                isValid = false
            } else {
                loginInputLayout.error = null
            }

            if (passwordText.isEmpty()) {
                passwordInputLayout.error = "O campo Password é obrigatório"
                isValid = false
            } else {
                passwordInputLayout.error = null
            }

            if (isValid) {
                CoroutineScope(Dispatchers.IO).launch {
                    try {
                        ApiIdlingResource.increment()

                        val authRequest = AuthRequest(username = loginText, password = passwordText)
                        val response = ApiClient.instance.authenticate(authRequest)

                        if (response.isSuccessful) {
                            withContext(Dispatchers.Main) {
                                Snackbar.make(view, "Login feito com sucesso!", Snackbar.LENGTH_LONG).show()
                            }
                        }

                        ApiIdlingResource.decrement()
                    } catch (e: HttpException) {
                        ApiIdlingResource.decrement()
                        withContext(Dispatchers.Main) {
                            Snackbar.make(view, "Erro de autenticação!", Snackbar.LENGTH_LONG).show()
                        }
                    } catch (e: IOException) {
                        ApiIdlingResource.decrement()
                        withContext(Dispatchers.Main) {
                            Snackbar.make(view, "Erro de conexão!", Snackbar.LENGTH_LONG).show()
                        }
                    }
                }
            }
        }

        return view
    }
}



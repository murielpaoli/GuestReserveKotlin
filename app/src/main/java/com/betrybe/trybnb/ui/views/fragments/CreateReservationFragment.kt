package com.betrybe.trybnb.ui.views.fragments

import androidx.fragment.app.Fragment
import com.betrybe.trybnb.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout


class CreateReservationFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_create_reservation, container, false)

        val firstNameLayout = view.findViewById<TextInputLayout>(R.id.first_name_create_reservation)
        val firstNameEditText = view.findViewById<TextInputEditText>(R.id.first_name_create_reservation_edit_text)
        val lastNameLayout = view.findViewById<TextInputLayout>(R.id.last_name_create_reservation)
        val lastNameEditText = view.findViewById<TextInputEditText>(R.id.last_name_create_reservation_edit_text)
        val checkinLayout = view.findViewById<TextInputLayout>(R.id.checkin_create_reservation)
        val checkinEditText = view.findViewById<TextInputEditText>(R.id.checkin_create_reservation_edit_text)
        val checkoutLayout = view.findViewById<TextInputLayout>(R.id.checkout_create_reservation)
        val checkoutEditText = view.findViewById<TextInputEditText>(R.id.checkout_create_reservation_edit_text)
        val additionalNeedsLayout = view.findViewById<TextInputLayout>(R.id.additional_needs_create_reservation)
        val additionalNeedsEditText = view.findViewById<TextInputEditText>(R.id.additional_needs_create_reservation_edit_text)
        val totalPriceLayout = view.findViewById<TextInputLayout>(R.id.total_price_create_reservation)
        val totalPriceEditText = view.findViewById<TextInputEditText>(R.id.total_price_create_reservation_edit_text)
        val depositPaidCheckBox = view.findViewById<CheckBox>(R.id.depositpaid_create_reservation)
        val createReservationButton = view.findViewById<Button>(R.id.create_reservation_button)

        createReservationButton.setOnClickListener {
            var isValid = true

            if (firstNameEditText.text.isNullOrEmpty()) {
                firstNameLayout.error = "O campo Nome é obrigatório"
                isValid = false
            } else {
                firstNameLayout.error = null
            }

            if (lastNameEditText.text.isNullOrEmpty()) {
                lastNameLayout.error = "O campo Sobrenome é obrigatório"
                isValid = false
            } else {
                lastNameLayout.error = null
            }

            if (checkinEditText.text.isNullOrEmpty()) {
                checkinLayout.error = "O campo Checkin é obrigatório"
                isValid = false
            } else {
                checkinLayout.error = null
            }

            if (checkoutEditText.text.isNullOrEmpty()) {
                checkoutLayout.error = "O campo Checkout é obrigatório"
                isValid = false
            } else {
                checkoutLayout.error = null
            }

            if (additionalNeedsEditText.text.isNullOrEmpty()) {
                additionalNeedsLayout.error = "O campo Necessidades Adicionais é obrigatório"
                isValid = false
            } else {
                additionalNeedsLayout.error = null
            }

            if (totalPriceEditText.text.isNullOrEmpty()) {
                totalPriceLayout.error = "O campo Preço Total é obrigatório"
                isValid = false
            } else {
                totalPriceLayout.error = null
            }

            if (isValid) {
                Snackbar.make(view, "Reserva criada com sucesso!", Snackbar.LENGTH_LONG).show()
            }
        }

        return view
    }
}

package com.example.liveapplivedata.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.liveapplivedata.ContactsViewmodel
import com.example.liveapplivedata.R


class ContactsFragment : Fragment() {

    private val viewmodel: ContactsViewmodel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contacts, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewmodel.filteredContacts.observe(viewLifecycleOwner) { filteredContacts ->

            Log.d("DatenTest3", filteredContacts.toString())

        }

        //User Input simulieren
        val userInput = "Do"

        //Dieser Code wäre normalerweise im onTextChangedListener
        viewmodel.filterContacts(userInput)


    }


}
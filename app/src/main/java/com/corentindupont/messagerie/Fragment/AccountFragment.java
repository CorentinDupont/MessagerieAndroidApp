package com.corentindupont.messagerie.Fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.corentindupont.messagerie.Constantes;
import com.corentindupont.messagerie.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class AccountFragment extends Fragment {

    EditText mailEditText;
    EditText nameEditText;
    EditText passwordEditText;

    public AccountFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_account, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //All Account Edit Text
        mailEditText = (EditText) getView().findViewById(R.id.account_email_edit_text);
        nameEditText = (EditText) getView().findViewById(R.id.account_name_edit_text);
        passwordEditText = (EditText) getView().findViewById(R.id.account_password_edit_text);

        if(savedInstanceState != null){
            //Restore account edit text values
            mailEditText.setText(savedInstanceState.getString(Constantes.ACCOUNT_EMAIL));
            nameEditText.setText(savedInstanceState.getString(Constantes.ACCOUNT_NAME));
            passwordEditText.setText(savedInstanceState.getString(Constantes.ACCOUNT_PASSWORD));
        }
    }

    //Save Account Edit Text Values
    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putString(Constantes.ACCOUNT_EMAIL, String.valueOf(mailEditText.getText()));
        outState.putString(Constantes.ACCOUNT_NAME, String.valueOf(nameEditText.getText()));
        outState.putString(Constantes.ACCOUNT_PASSWORD, String.valueOf(passwordEditText.getText()));
        super.onSaveInstanceState(outState);
    }

}

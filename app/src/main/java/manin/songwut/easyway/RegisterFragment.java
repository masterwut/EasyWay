package manin.songwut.easyway;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class RegisterFragment extends Fragment{


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Create Toolbar
        createToolbar();

    }   // Main Method

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.itemUpload) {

    //       Get Value From EditText
            EditText nameEditText = getView().findViewById(R.id.edtName);
            EditText userEditText = getView().findViewById(R.id.edtUser);
            EditText passwordEditText = getView().findViewById(R.id.edtPassword);


            String nameString = nameEditText.getText().toString().trim();
            String userString = userEditText.getText().toString().trim();
            String passwordString = passwordEditText.getText().toString().trim();

//            Check Space
            if (nameString.isEmpty()|| userString.isEmpty() || passwordString.isEmpty()) {

//                Have Space
                MyAlert myAlert = new MyAlert(getActivity());
                myAlert.normalDialog("Have Space","Please Fill All Blank");



            } else {

//                No Space



            }




        } // if


        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);

        inflater.inflate(R.menu.menu_register,menu);


    }

    private void createToolbar() {
        Toolbar toolbar = getView().findViewById(R.id.toolbarRegister);
        ((MainActivity)getActivity()).setSupportActionBar(toolbar);

        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Register");

        ((MainActivity) getActivity()).getSupportActionBar().setSubtitle("Please fill all blank");

        ((MainActivity) getActivity()).getSupportActionBar().setHomeButtonEnabled(true);
        ((MainActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setHasOptionsMenu(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().popBackStack();

            }
        });



    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_register, container, false);
        return view;
    }
}

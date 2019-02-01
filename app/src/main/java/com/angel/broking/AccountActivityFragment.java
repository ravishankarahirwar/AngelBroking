package com.angel.broking;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.angel.broking.adapter.AccountAdapter;
import com.angel.broking.models.AccountData;

/**
 * A placeholder fragment containing a simple view.
 */
public class AccountActivityFragment extends Fragment {
    private RecyclerView mCountryList;
    public AccountActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_account, container, false);
        init(rootView);
        return rootView;
    }

    private void init(View rootView) {
        mCountryList =  rootView.findViewById(R.id.wallet_list);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        mCountryList.setLayoutManager(mLayoutManager);
        mCountryList.setItemAnimator(new DefaultItemAnimator());
        AccountAdapter accountAdapter = new AccountAdapter(getContext(), AccountData.getAccountList());
        mCountryList.setAdapter(accountAdapter);
    }
}

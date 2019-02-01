package com.angel.broking.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.angel.broking.R;
import com.angel.broking.models.Account;

import java.util.List;

/**
 * @author Ravishankar
 * @version 1.0
 * @since 31-01-2019
 */
public class AccountAdapter extends RecyclerView.Adapter<AccountAdapter.CountryViewHolder> {
    private List<Account> mUsers;
    private Context mContext;

    public AccountAdapter(Context context, List<Account> users ) {
        this.mContext = context;
        this.mUsers = users;
   }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_account, viewGroup, false);

        return new CountryViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder countryViewHolder, int position) {
        final Account user = mUsers.get(position);
        countryViewHolder.userName.setText(user.getWalletName());
        countryViewHolder.walletAmount.setText(String.valueOf(user.getAmount()));

        Drawable progressDrawable = countryViewHolder.progress.getProgressDrawable().mutate();
        switch (user.getWalletType()) {
            case Account.MAIN_WALLET :
                progressDrawable.setColorFilter(mContext.getResources().getColor(R.color.main_wallet), android.graphics.PorterDuff.Mode.SRC_IN);
                break;
            case Account.SAVING_WALLET :
                progressDrawable.setColorFilter(mContext.getResources().getColor(R.color.saving_wallet), android.graphics.PorterDuff.Mode.SRC_IN);
                break;
            case Account.SUMMER_WALLET :
                progressDrawable.setColorFilter(mContext.getResources().getColor(R.color.summer_wallet), android.graphics.PorterDuff.Mode.SRC_IN);
                break;
        }
        countryViewHolder.progress.setProgressDrawable(progressDrawable);

        switch (user.getStatus()) {
            case Account.TYPE_DABIT :
            countryViewHolder.walletStatus.setTextColor(mContext.getResources().getColor(R.color.main_wallet));
                countryViewHolder.walletPercentage.setTextColor(mContext.getResources().getColor(R.color.main_wallet));
                break;

            case Account.TYPE_CREDIT :
                countryViewHolder.walletStatus.setTextColor(mContext.getResources().getColor(R.color.saving_wallet));
                countryViewHolder.walletPercentage.setTextColor(mContext.getResources().getColor(R.color.saving_wallet));
                break;
        }

        }

    @Override
    public int getItemCount() {
        return mUsers.size();
    }

    class CountryViewHolder extends RecyclerView.ViewHolder {
        public TextView userName;
        public TextView walletAmount;
        public TextView walletStatus;
        public TextView walletPercentage;
        public ProgressBar progress;

        public CountryViewHolder(@NonNull View itemView) {
            super(itemView);

            userName = itemView.findViewById(R.id.wallet_name);
            walletStatus = itemView.findViewById(R.id.wallet_status);
            walletPercentage = itemView.findViewById(R.id.wallet_progress_percentage);
            walletAmount = itemView.findViewById(R.id.wallet_amount);
            progress = itemView.findViewById(R.id.progress);
        }
    }

    public String capatalizedWord(String word) {
        if(word == null || word.length() < 1)
            return null;
        else {
            return word.substring(0,1).toUpperCase() + word.substring(1);
        }
    }
}

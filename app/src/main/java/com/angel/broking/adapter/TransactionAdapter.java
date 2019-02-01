package com.angel.broking.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.angel.broking.R;
import com.angel.broking.models.Transaction;

import java.util.List;

/**
 * @author Ravishankar
 * @version 1.0
 * @since 11-01-2019
 */
public class TransactionAdapter extends RecyclerView.Adapter<TransactionAdapter.TransactionViewHolder> {
    private List<Transaction> mUsers;
    private Context mContext;

    public TransactionAdapter(Context context, List<Transaction> users ) {
        this.mContext = context;
        this.mUsers = users;
   }

    @NonNull
    @Override
    public TransactionViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_user, viewGroup, false);

        return new TransactionViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull TransactionViewHolder viewHolder, int position) {
        final Transaction transaction = mUsers.get(position);
        viewHolder.icon.setImageResource(transaction.getIcon());
        viewHolder.name.setText(transaction.getName());
        viewHolder.detail.setText(transaction.getDescription());
        viewHolder.amount.setText(String.valueOf(transaction.getAmount()));
        viewHolder.date.setText(transaction.getDate());

        switch (transaction.getType()) {
            case Transaction.TYPE_DABIT:
                viewHolder.amount.setTextColor(mContext.getResources().getColor(R.color.main_wallet));
                viewHolder.dabitCredit.setText("+");
                viewHolder.dabitCredit.setTextColor(mContext.getResources().getColor(R.color.main_wallet));
                viewHolder.currency.setTextColor(mContext.getResources().getColor(R.color.main_wallet));
                break;

            case Transaction.TYPE_CREDIT:
                viewHolder.amount.setTextColor(mContext.getResources().getColor(R.color.saving_wallet));
                viewHolder.dabitCredit.setText("-");
                viewHolder.dabitCredit.setTextColor(mContext.getResources().getColor(R.color.saving_wallet));
                viewHolder.currency.setTextColor(mContext.getResources().getColor(R.color.saving_wallet));
                break;
        }
    }

    @Override
    public int getItemCount() {
        return mUsers.size();
    }

    class TransactionViewHolder extends RecyclerView.ViewHolder {
        public ImageView icon;
        public TextView name;
        public TextView detail;
        public TextView amount;
        public TextView date;
        public TextView dabitCredit;
        public TextView currency;


        public TransactionViewHolder(@NonNull View itemView) {
            super(itemView);
            icon = itemView.findViewById(R.id.transaction_icon);
            name = itemView.findViewById(R.id.transaction_name);
            detail = itemView.findViewById(R.id.transaction_detail);
            amount = itemView.findViewById(R.id.transaction_amt);
            date = itemView.findViewById(R.id.transaction_date);
            dabitCredit = itemView.findViewById(R.id.transaction_dc);
            currency = itemView.findViewById(R.id.transaction_currency);
        }
    }
}

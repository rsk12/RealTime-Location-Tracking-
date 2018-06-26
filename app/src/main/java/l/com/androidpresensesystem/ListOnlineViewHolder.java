package l.com.androidpresensesystem;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

public class ListOnlineViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView txtEmail;

    ItemClickListener itemClickListener;


    public ListOnlineViewHolder(View itemView) {
        super(itemView);



        /*txtEmail.setOnClickListener(this);*/

        txtEmail = (TextView) itemView.findViewById(R.id.txt_email);

        itemView.setOnClickListener(this);
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick(View view) {

        itemClickListener.onClick(view,getAdapterPosition());

    }
}

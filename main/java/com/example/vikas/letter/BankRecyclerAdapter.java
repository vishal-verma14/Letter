package com.example.vikas.letter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * Created by vikas on 25/7/16.
 */
public class BankRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private String[] title = {"LOAN REQUEST","DEMAND DRAFT CANCELLATION"};

    public TextView itemTitle;

    int Position;

    private Context context;

    public BankRecyclerAdapter(Context context) {
        this.context = context;
    }




    class viewHolder extends RecyclerView.ViewHolder{

    public viewHolder(View itemView) {
        super(itemView);
        itemTitle = (TextView)itemView.findViewById(R.id.item_title);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Position = getAdapterPosition();

                if (Position == 0) {
                    v.getContext().startActivity(new Intent(context, Loan.class));
                }else if (Position == 1){
                    v.getContext().startActivity(new Intent(context, DraftCancellation.class));
                }
            }
        });
    }


}
     @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {


         View v= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardviewpanel, viewGroup,false);

        RecyclerView.ViewHolder viewHolder =  new viewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {

        itemTitle.setText(title[position]);

    }

    @Override
    public int getItemCount() {
        return title.length;
    }
}

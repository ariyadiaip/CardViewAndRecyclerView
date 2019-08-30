package id.sch.bdg.smkn4.pwpb.cardviewandrecyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MailAdapter extends RecyclerView.Adapter<MailAdapter.ViewHolder> {

    private List<Mail> mailList;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        //each data item is just a string in this case
        public TextView logo, tvname ,tvtitle, tvcontent, tvtime;

        public ViewHolder(View v) {
            super(v);
            logo = (TextView)v.findViewById(R.id.imgAccount);
            tvname = (TextView)v.findViewById(R.id.name);
            tvtitle = (TextView)v.findViewById(R.id.title);
            tvcontent = (TextView)v.findViewById(R.id.content);
            tvtime = (TextView) v.findViewById(R.id.time);
        }
    }

    //provide a suitable constructor
    public MailAdapter(List<Mail> mailList) {
        this.mailList = mailList;
    }

    //Create new views (invoked by the layout manager)

    @NonNull
    @Override
    public MailAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_list,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MailAdapter.ViewHolder holder, int position) {
        Mail mail = mailList.get(position);
        holder.logo.setText(mail.getInisial());
        holder.tvname.setText(mail.getName());
        holder.tvtitle.setText(mail.getTitle());
        holder.tvcontent.setText(mail.getContent());
        holder.tvtime.setText(mail.getTime());
        holder.logo.setBackgroundResource(mail.getImgBackground());
    }

    @Override
    public int getItemCount() {
        return mailList.size();
    }
}

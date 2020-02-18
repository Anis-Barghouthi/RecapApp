package tn.esprit.recapapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import tn.esprit.recapapp.Country;
import tn.esprit.recapapp.R;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.CountryHolder> {

    private Context mContext;
    private List<Country> countries;

    @NonNull
    @Override
    public CountryAdapter.CountryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View rootView;
        rootView = LayoutInflater.from(mContext).inflate(R.layout.single_row_country, parent, false);
        return new CountryHolder(rootView);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryAdapter.CountryHolder holder, int position) {
        Country singleItem = countries.get(position);

        holder.txtCountry.setText(singleItem.getNom());
        holder.imgCountry.setImageResource(singleItem.getImage());
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }

    public class CountryHolder extends RecyclerView.ViewHolder { // single_row_country
        private TextView txtCountry;
        private ImageView imgCountry;

        public CountryHolder(@NonNull View itemView) {
            super(itemView);

            txtCountry = itemView.findViewById(R.id.txtCountry);
            imgCountry = itemView.findViewById(R.id.imageCountry);
        }
    }
}

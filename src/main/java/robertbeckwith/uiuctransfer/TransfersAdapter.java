package robertbeckwith.uiuctransfer;

/**
 * Created by rjbec on 5/6/2017.
 */
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class TransfersAdapter extends ArrayAdapter<Transfers> {
    Context context;
    private ArrayList<Transfers> transferArray;

    public TransfersAdapter(Context context, int textViewResourceId, ArrayList<Transfers> items) {
        super(context, textViewResourceId, items);
        this.context = context;
        this.transferArray = items;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            LayoutInflater vi = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = vi.inflate(R.layout.transfers, null);
        }

        Transfers transfers = transferArray.get(position);
        if (transfers != null) {
            TextView symbol = (TextView) v.findViewById(R.id.symbol);
            TextView name = (TextView) v.findViewById(R.id.name);
            TextView code = (TextView) v.findViewById(R.id.code);
            TextView cod = (TextView) v.findViewById(R.id.cod);
            TextView uiucsymbol = (TextView) v.findViewById(R.id.uiucsymbol);
            TextView uiuccode = (TextView) v.findViewById(R.id.uiuccode);
            TextView ssHum = (TextView) v.findViewById(R.id.ssHum);
            TextView westerneastern = (TextView) v.findViewById(R.id.westerneastern);
            symbol.setText(String.valueOf(transfers.getSymbol()));
            name.setText(String.valueOf(transfers.getName()));
            code.setText(String.valueOf(transfers.getCode()));
            cod.setText(String.valueOf(transfers.getCod()));
            uiucsymbol.setText(String.valueOf(transfers.getUiucsymbol()));
            uiuccode.setText(String.valueOf(transfers.getUiuccode()));
            ssHum.setText(String.valueOf(transfers.getSsHum()));
            westerneastern.setText(String.valueOf(transfers.getWesterneastern()));
        }
        return v;
    }
}

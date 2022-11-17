package beelove.store.servicetirefitting;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import beelove.store.servicetirefitting.databinding.ItemDataBinding;

public class DataAdapter extends RecyclerView.Adapter<DataViewHolder>{

    private List<String> data = new ArrayList<String>();

    public void addDataList(List<String> data) {
        int oldSize = this.data.size();
        this.data.addAll(data);
        notifyItemRangeInserted(oldSize, oldSize + data.size());
    }

    @NonNull
    @Override
    public DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemDataBinding binding = ItemDataBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new DataViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull DataViewHolder holder, int position) {
        holder.binding.tvTitle.setText(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}

class DataViewHolder extends RecyclerView.ViewHolder {

    ItemDataBinding binding;

    DataViewHolder(ItemDataBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

}
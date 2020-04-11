package me.syamfdl.covidobserver.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import me.syamfdl.covidobserver.R
import me.syamfdl.covidobserver.data.Recap
import me.syamfdl.covidobserver.databinding.ItemRecapBinding

class RecapAdapter (private val recap: List<Recap>
) : RecyclerView.Adapter<RecapAdapter.RecapViewHolder>() {

    inner class RecapViewHolder( val itemRecapBinding: ItemRecapBinding
    ) : RecyclerView.ViewHolder(itemRecapBinding.root)

    override fun getItemCount() = recap.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = RecapViewHolder(
        DataBindingUtil.inflate(LayoutInflater.from(parent.context),
        R.layout.item_recap, parent, false)
    )

    override fun onBindViewHolder(holder: RecapViewHolder, position: Int) {
        holder.itemRecapBinding.tvTitle.text = recap[position].titleName
        holder.itemRecapBinding.tvNumber.text = recap[position].totalNumber.toString()
    }


}
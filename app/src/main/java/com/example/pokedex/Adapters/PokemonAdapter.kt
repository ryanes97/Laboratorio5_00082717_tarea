package com.example.pokedex.Adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.pokedex.Model.Pokemon

class PokemonAdapter(var items: ArrayList<Pokemon>, val clickListener: (Pokemon)->Unit): RecyclerView.Adapter<PokemonAdapter.ViewHolder>() , MyAdapter {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.poke_item,parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount() = items.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(items[position], clickListener)

    override fun changeDataSet(newDataSet: ArrayList<Pokemon>) {
        this.items = newDataSet
        notifyDataSetChanged()
    }
}
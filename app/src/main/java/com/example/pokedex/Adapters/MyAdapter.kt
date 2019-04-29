package com.example.pokedex.Adapters

import com.example.pokedex.Model.Pokemon

interface MyAdapter {
    fun changeDataSet(newDataSet : ArrayList<Pokemon>)
}
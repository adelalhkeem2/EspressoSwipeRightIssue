package com.example.espressoswiperightissue

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomViewPagerAdapter: RecyclerView.Adapter<CustomViewPagerAdapter.CustomViewHolder>() {

  class CustomViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val textView: TextView

    init {
      textView = view.findViewById(R.id.textView)
    }
  }

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
    val view = LayoutInflater.from(parent.context)
      .inflate(R.layout.text_row_item, parent, false)

    return CustomViewHolder(view)
  }

  override fun getItemCount(): Int {
    return 2
  }

  override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
    holder.textView.text = "Page $position"
  }
}
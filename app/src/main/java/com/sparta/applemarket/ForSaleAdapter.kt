package com.sparta.applemarket

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sparta.applemarket.databinding.ForSaleItemBinding
import java.text.DecimalFormat

class ForSaleAdapter(val iData: MutableList<ForSale>): RecyclerView.Adapter<ForSaleAdapter.Holder>() {
    var format: DecimalFormat = DecimalFormat("###,###,##0")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder { //뷰홀더 만들자!
        val binding = ForSaleItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Holder(binding) //'뷰'니까 홀드할 레이아웃이 있어야겠지. 그 레이아웃을 바인딩으로 불러온 것.
    }

    override fun getItemCount(): Int { //아이템 몇 개임?
        return iData.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) { //각각의 아이템에서
        holder.img.setImageResource(iData[position].img)
        holder.title.text = iData[position].title
        holder.address.text = iData[position].address
        holder.price.text = format.format(iData[position].price) + "원" //가격
        holder.likes.text = iData[position].likes.toString()
        holder.chat.text = iData[position].chat.toString()
    }

    inner class Holder(private val itemBinding: ForSaleItemBinding): RecyclerView.ViewHolder(itemBinding.root) {
        val img = itemBinding.image
        val title = itemBinding.title
        val address = itemBinding.address
        val price = itemBinding.price
        var likes = itemBinding.likesCount
        var chat = itemBinding.chatCount
    }
}
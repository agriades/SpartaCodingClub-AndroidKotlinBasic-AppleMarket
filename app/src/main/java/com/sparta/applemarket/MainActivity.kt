package com.sparta.applemarket

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.sparta.applemarket.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        val forSale1 = ForSale(1, R.drawable.sample1, resources.getString(R.string.fs_title_1), resources.getString(R.string.fs_desc_1),
            resources.getString(R.string.fs_seller_1), 1000, resources.getString(R.string.fs_address_1), 13, 25)
        val forSale2 = ForSale(2, R.drawable.sample2, resources.getString(R.string.fs_title_2), resources.getString(R.string.fs_desc_2),
            resources.getString(R.string.fs_seller_2), 20000, resources.getString(R.string.fs_address_2), 8, 28)
        val forSale3 = ForSale(3, R.drawable.sample3, resources.getString(R.string.fs_title_3), resources.getString(R.string.fs_desc_3),
                resources.getString(R.string.fs_seller_3), 10000, resources.getString(R.string.fs_address_3), 23, 5)
        val forSale4 = ForSale(4, R.drawable.sample4, resources.getString(R.string.fs_title_4), resources.getString(R.string.fs_desc_4),
            "@strings/fs_seller_4", 10000, resources.getString(R.string.fs_address_4), 14, 17)
        val forSale5 = ForSale(5, R.drawable.sample5, resources.getString(R.string.fs_title_5), resources.getString(R.string.fs_desc_5),
            "@strings/fs_seller_5", 150000, resources.getString(R.string.fs_address_5), 22, 9)
        val forSale6 = ForSale(6,  R.drawable.sample6, resources.getString(R.string.fs_title_6), resources.getString(R.string.fs_desc_6),
            "@strings/fs_seller_6", 50000, resources.getString(R.string.fs_address_6), 25, 16)
        val forSale7 = ForSale(7,  R.drawable.sample7, resources.getString(R.string.fs_title_7), resources.getString(R.string.fs_desc_7),
            "@strings/fs_seller_7", 150000, resources.getString(R.string.fs_address_7), 142, 54)
        val forSale8 = ForSale(8,  R.drawable.sample8, resources.getString(R.string.fs_title_8), resources.getString(R.string.fs_desc_8),
            "@strings/fs_seller_8", 180000, resources.getString(R.string.fs_address_8), 31, 7)
        val forSale9 = ForSale(9,  R.drawable.sample9, resources.getString(R.string.fs_title_9), resources.getString(R.string.fs_desc_9),
            "@strings/fs_seller_9", 30000, resources.getString(R.string.fs_address_9), 7, 28)
        val forSale10 = ForSale(10,  R.drawable.sample10, resources.getString(R.string.fs_title_10), resources.getString(R.string.fs_desc_10),
            "@strings/fs_seller_10", 190000, resources.getString(R.string.fs_address_10), 40, 6)

        val dataList = mutableListOf<ForSale>(forSale1, forSale2, forSale3, forSale4, forSale5, forSale6, forSale7, forSale8, forSale9, forSale10)
        val adapter = ForSaleAdapter(dataList)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this) //세로로 연결되므로.

    }
}

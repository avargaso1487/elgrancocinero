package com.example.elgrancocinero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.elgrancocinero.adapter.MainCategoryAdapter
import com.example.elgrancocinero.adapter.SubCategoryAdapter
import com.example.elgrancocinero.entities.Recipes
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    var arrMainCategory = ArrayList<Recipes>()
    var arrSubCategory = ArrayList<Recipes>()

    var mainCategoryAdapter = MainCategoryAdapter()
    var subCategoryAdapter = SubCategoryAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //Data Temporal
        arrMainCategory.add(Recipes(1, "Carne"))
        arrMainCategory.add(Recipes(2, "Pollo"))
        arrMainCategory.add(Recipes(3, "Postre"))
        arrMainCategory.add(Recipes(4, "Cerdo"))

        mainCategoryAdapter.setData(arrMainCategory)

        arrSubCategory.add(Recipes(1, "Lomito Saltado"))
        arrSubCategory.add(Recipes(2, "Pollo a la Brasa"))
        arrSubCategory.add(Recipes(3, "Tres Leches"))
        arrSubCategory.add(Recipes(4, "Arroz con chancho"))

        subCategoryAdapter.setData(arrSubCategory)

        rv_main_category.LayoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rv_main_category.adapter = mainCategoryAdapter

        rv_sub_category.LayoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rv_sub_category.adapter = subCategoryAdapter

    }
}
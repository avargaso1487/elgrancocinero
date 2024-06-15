package com.example.elgrancocinero.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.elgrancocinero.entities.Recipes

@Dao
interface RecipeDao {
    @get:Query(values "SELECT * FROM recipes ORDER BY id DESC")
    val allRecipes: List<Recipes>

    @Insert(onclonflict = OnConflictStrategy.REPLACE)
    fun insertRecipe(recipes: Recipes)
}
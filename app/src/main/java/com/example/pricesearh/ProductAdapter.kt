package com.example.pricesearh

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pricesearh.databinding.ProductItemBinding

class ProductAdapter: RecyclerView.Adapter<ProductAdapter.ProductHolder>() {
    val productList = ArrayList<Product>()
    //Ставим viewbinding т.к без него жопно.Создаем новый класс холдера и наследуемся от РВ холдера.
    // дальше указываем что из класса продукт нам надо брать картинку,название и цену.
    //Еще надо добавить 3 функции адаптера
    class ProductHolder(item: View): RecyclerView.ViewHolder(item) {
        val binding = ProductItemBinding.bind(item)

        fun bind(product: Product) = with(binding){
            imageProduct.setImageResource(product.imageid)
            nameProduct.text = product.title
            priceProduct.text = product.price.toString()

        }
    }
    //Берет разметку и раздувает ее для каждого отдельного продукта из списка
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.product_item, parent, false)
        return ProductHolder(view)
    }
    //По позиции элемента из списка заполняет пустую разметку.Т.е 1 позиция = 1 картинке,1 имени и 1 цене.
    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        holder.bind(productList[position])
    }
    //Передаем кол-во элементов в списке для заполнения
    override fun getItemCount(): Int {
        return productList.size
    }
}
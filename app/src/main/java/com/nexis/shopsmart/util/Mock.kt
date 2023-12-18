package com.nexis.shopsmart.util


import com.example.shopssmart.model.local.BannerModel
import com.example.shopssmart.model.local.CategoryModel
import com.nexis.shopsmart.R
import com.nexis.shopsmart.model.local.ColorsModel
import com.nexis.shopsmart.model.local.ProductModel
import com.nexis.shopsmart.model.local.YourCardModel

object Mock {
    fun getMockProducts(): ArrayList<ProductModel> {
        return arrayListOf(
            ProductModel(
                productId = "dsa123654",
                productTitle = "HP Ultr HD",
                productImage = "",
                productPrice = "1299 $",
                productDescription = "ftyjetyje",
                isFavorite = true
            ),
            ProductModel(
                productId = "dsa123654",
                productTitle = "HP Ultr HD",
                productImage = "",
                productPrice = "1299 $",
                productDescription = "ftyjetyje",
                isFavorite = false
            ),
            ProductModel(
                productId = "dsa123654",
                productTitle = "HP Ultr HD",
                productImage = "",
                productPrice = "1299 $",
                productDescription = "ftyjetyje",
                isFavorite = false
            ),
            ProductModel(
                productId = "dsa123654",
                productTitle = "HP Ultr HD",
                productImage = "",
                productPrice = "1299 $",
                productDescription = "ftyjetyje",
                isFavorite = true
            ),
            ProductModel(
                productId = "dsa123654",
                productTitle = "HP Ultr HD",
                productImage = "",
                productPrice = "1299 $",
                productDescription = "ftyjetyje",
                isFavorite = false
            ),
            ProductModel(
                productId = "dsa123654",
                productTitle = "HP Ultr HD",
                productImage = "",
                productPrice = "1299 $",
                productDescription = "ftyjetyje",
                isFavorite = false
            ),
            ProductModel(
                productId = "dsa123654",
                productTitle = "HP Ultr HD",
                productImage = "",
                productPrice = "1299 $",
                productDescription = "ftyjetyje",
                isFavorite = false
            ),
            ProductModel(
                productId = "dsa123654",
                productTitle = "HP Ultr HD",
                productImage = "",
                productPrice = "1299 $",
                productDescription = "ftyjetyje",
                isFavorite = true
            ),
            ProductModel(
                productId = "dsa123654",
                productTitle = "HP Ultr HD",
                productImage = "",
                productPrice = "1299 $",
                productDescription = "ftyjetyje",
                isFavorite = false
            ),
            ProductModel(
                productId = "dsa123654",
                productTitle = "HP Ultr HD",
                productImage = "",
                productPrice = "1299 $",
                productDescription = "ftyjetyje",
                isFavorite = false
            ),
            ProductModel(
                productId = "dsa123654",
                productTitle = "HP Ultr HD",
                productImage = "",
                productPrice = "1299 $",
                productDescription = "ftyjetyje",
                isFavorite = true
            ),
            ProductModel(
                productId = "dsa123654",
                productTitle = "HP Ultr HD",
                productImage = "",
                productPrice = "1299 $",
                productDescription = "ftyjetyje",
                isFavorite = false
            ),
            ProductModel(
                productId = "dsa123654",
                productTitle = "HP Ultr HD",
                productImage = "",
                productPrice = "1299 $",
                productDescription = "ftyjetyje",
                isFavorite = false
            ),
            ProductModel(
                productId = "dsa123654",
                productTitle = "HP Ultr HD",
                productImage = "",
                productPrice = "1299 $",
                productDescription = "ftyjetyje",
                isFavorite = false
            ),
            ProductModel(
                productId = "dsa123654",
                productTitle = "HP Ultr HD",
                productImage = "",
                productPrice = "1299 $",
                productDescription = "ftyjetyje",
                isFavorite = false
            ),
            ProductModel(
                productId = "dsa123654",
                productTitle = "HP Ultr HD",
                productImage = "",
                productPrice = "1299 $",
                productDescription = "ftyjetyje",
                isFavorite = false
            ),
            ProductModel(
                productId = "dsa123654",
                productTitle = "HP Ultr HD",
                productImage = "",
                productPrice = "1299 $",
                productDescription = "ftyjetyje",
                isFavorite = false
            ),
            ProductModel(
                productId = "dsa123654",
                productTitle = "HP Ultr HD",
                productImage = "",
                productPrice = "1299 $",
                productDescription = "ftyjetyje",
                isFavorite = false
            )
        )
    }
}

fun getMockBanners(): ArrayList<BannerModel> {
    return arrayListOf(
        BannerModel(
            bannerId = 1,
            bannerIcon = R.drawable.ic_banner
        )
    )
}


fun getMockCategories(): ArrayList<CategoryModel> {
    return arrayListOf(
        CategoryModel(
            categoryId = 1,
            categoryName = "Apparel",
            categoryIcon = R.drawable.ic_category_school
        ),
        CategoryModel(
            categoryId = 2,
            categoryName = "School",
            categoryIcon = R.drawable.ic_category_school
        ),
        CategoryModel(
            categoryId = 3,
            categoryName = "Sport",
            categoryIcon = R.drawable.ic_category_sports
        ),
        CategoryModel(
            categoryId = 4,
            categoryName = "Electronics",
            categoryIcon = R.drawable.ic_category_electronic
        ),
        CategoryModel(
            categoryId = 5,
            categoryName = "All",
            categoryIcon = R.drawable.ic_category_all
        )
    )
}


fun getMockColors(): ArrayList<ColorsModel> {
    return arrayListOf(
        ColorsModel(
            colorsId = 1,
            colorsName = R.color.colorMistyRose
        ),
        ColorsModel(
            colorsId = 2,
            colorsName = R.color.colorWhiteGreen
        ),
        ColorsModel(
            colorsId = 3,
            colorsName = R.color.colorWhiteSmoke
        ),
        ColorsModel(
            colorsId = 4,
            colorsName = R.color.colorWhiteGray
        ),
        ColorsModel(
            colorsId = 5,
            colorsName = R.color.colorBlack
        )
    )
}


fun getMockYourCard(): ArrayList<YourCardModel> {
    return arrayListOf(
        YourCardModel(
            CardId = 1,
            CardBasliq = "Apparel1",
            CardQiymeti = "123",
            CardRengi = "Qara",
            CardSekili = R.drawable.ic_category_school,
            CardSayi = 0
        ),
        YourCardModel(
            CardId = 2,
            CardBasliq = "Apparel2",
            CardQiymeti = "456",
            CardRengi = "Qırmızı",
            CardSekili = R.drawable.ic_category_school,
            CardSayi = 0
        ),
        YourCardModel(
            CardId = 3,
            CardBasliq = "Apparel3",
            CardQiymeti = "789",
            CardRengi = "Boz",
            CardSekili = R.drawable.ic_category_electronic,
            CardSayi = 0
        ),
        YourCardModel(
            CardId = 4,
            CardBasliq = "Apparel4",
            CardQiymeti = "951",
            CardRengi = "Ağ",
            CardSekili = R.drawable.ic_category_sports,
            CardSayi = 0
        )
    )
}
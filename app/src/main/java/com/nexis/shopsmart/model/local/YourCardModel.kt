package com.nexis.shopsmart.model.local

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
@Parcelize
data class YourCardModel(
    val CardId: Int,
    val CardBasliq: String,
    val CardQiymeti: String,
    val CardRengi: String,
    val CardSekili: Int,
    val CardSayi: Int
): Parcelable
package com.example.tomandjerry.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.BadgeCardBackGround
import com.example.tomandjerry.ui.theme.IBMPlexSansArabicFont
import com.example.tomandjerry.ui.theme.IBMPlexSansFont
import com.example.tomandjerry.ui.theme.MainBackgroundColor
import com.example.tomandjerry.ui.theme.PriceCardColor
import com.example.tomandjerry.ui.theme.SearchTextColor
import com.example.tomandjerry.ui.theme.SubTitleColor
import com.example.tomandjerry.ui.theme.TitleColor
import com.example.tomandjerry.ui.theme.TomCardBackGround


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun JerryStore() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MainBackgroundColor)
            .padding(start = 16.dp, end = 16.dp, top = 2.dp)
    ) {
        HeaderView()
        Spacer(Modifier.size(12.dp))
        SearchView()
        Column(
            modifier = Modifier.verticalScroll(rememberScrollState())
        ) {
            AdvertisingView()
            Spacer(Modifier.size(24.dp))
            TomSectionHeader()
            Spacer(Modifier.size(16.dp))
            TomSection()
        }

    }
}

@Composable
private fun HeaderView() {
    Row(
        modifier = Modifier.padding(vertical = 4.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.profile_image),
            contentDescription = "Profile image",
            modifier = Modifier
                .size(48.dp)
                .clip(RoundedCornerShape(12.dp))
        )
        Spacer(modifier = Modifier.size(8.dp))
        Column(
            modifier = Modifier
                .weight(1F)
                .padding(vertical = 4.5.dp)
        ) {
            Text(
                text = "Hi, Jerry \uD83D\uDC4B\uD83C\uDFFB",
                color = TitleColor,
                fontFamily = IBMPlexSansArabicFont,
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp
            )
            Text(
                text = "Which Tom do you want to buy?",
                color = SubTitleColor,
                fontFamily = IBMPlexSansArabicFont,
                fontWeight = FontWeight.Normal,
                fontSize = 10.sp
            )
        }
        Spacer(modifier = Modifier.size(8.dp))
        BadgedBox(
            modifier = Modifier.padding(top = 2.dp),
            badge = {
                Badge(
                    containerColor = BadgeCardBackGround
                ) {
                    Text(
                        text = "3",
                        fontFamily = IBMPlexSansArabicFont,
                        fontWeight = FontWeight.Medium,
                        fontSize = 10.sp,
                        color = TomCardBackGround
                    )
                }
            }
        ) {
            Box(
                modifier = Modifier
                    .padding(top = 2.dp)
                    .size(40.dp)
                    .border(
                        width = 1.dp,
                        color = TitleColor.copy(alpha = 0.15F),
                        shape = RoundedCornerShape(12.dp)
                    ),
                contentAlignment = Alignment.Center,
            ) {
                Icon(
                    painter = painterResource(R.drawable.notification_icon),
                    contentDescription = "Notifications",
                    modifier = Modifier.width(24.dp)
                )
            }
        }
    }
}

@Composable
private fun SearchView() {
    Row {
        Row(
            modifier = Modifier
                .clip(RoundedCornerShape(12.dp))
                .background(TomCardBackGround)
                .padding(12.dp)
                .weight(1F),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(R.drawable.search_icon),
                contentDescription = "search",
                colorFilter = ColorFilter.tint(SearchTextColor),
                modifier = Modifier.size(24.dp)
            )
            Spacer(Modifier.size(8.dp))
            Text(
                text = "Search about tom ...",
                color = SearchTextColor,
                fontSize = 14.sp,
                fontFamily = IBMPlexSansArabicFont,
                fontWeight = FontWeight.Normal,
            )
        }
        Spacer(Modifier.size(8.dp))
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(12.dp))
                .background(BadgeCardBackGround)
                .size(48.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(R.drawable.filter_icon),
                contentDescription = "filter",
                colorFilter = ColorFilter.tint(TomCardBackGround),
                modifier = Modifier.size(24.dp)
            )
        }
    }
}

@Composable
fun AdvertisingView() {
    Box(
        modifier = Modifier
            .padding(top = 8.dp)
            .height(108.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.promotion_banner),
            contentDescription = "Promotion Banner",
            modifier = Modifier
                .padding(top = 16.dp)
                .clip(RoundedCornerShape(16.dp))
                .height(92.dp)
                .fillMaxWidth(),
            contentScale = ContentScale.FillWidth
        )
        Image(
            painter = painterResource(R.drawable.tom_image_1),
            contentDescription = "Tom image",
            modifier = Modifier
                .size(width = 115.38.dp, height = 108.dp)
                .padding(end = 0.dp)
                .align(Alignment.TopEnd)

        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 28.dp, start = 12.dp, bottom = 16.dp)
        ) {
            Text(
                text = "Buy 1 Tom and get 2 for free",
                fontFamily = IBMPlexSansArabicFont,
                fontWeight = FontWeight.SemiBold,
                color = TomCardBackGround,
                fontSize = 16.sp,
                overflow = TextOverflow.Ellipsis
            )
            Spacer(Modifier.size(8.dp))
            Row {
                Text(
                    text = "Adopt Tom! (Free Fail-Free Guarantee)",
                    fontFamily = IBMPlexSansFont,
                    fontWeight = FontWeight.Normal,
                    color = TomCardBackGround,
                    modifier = Modifier.weight(2F),
                    fontSize = 12.sp,
                    overflow = TextOverflow.Ellipsis
                )
                Box(modifier = Modifier.weight(1F))
            }
        }
    }
}

@Composable
fun TomSectionHeader() {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            modifier = Modifier.weight(1F),
            text = "Cheap tom section",
            fontFamily = IBMPlexSansArabicFont,
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp,
            letterSpacing = 0.sp,
            color = TitleColor
        )
        Row(
            modifier = Modifier
                .weight(0.5F)
                .padding(vertical = 6.dp),
            horizontalArrangement = Arrangement.End
        ) {
            Text(
                text = "View all",
                color = BadgeCardBackGround,
                fontFamily = IBMPlexSansArabicFont,
                fontWeight = FontWeight.Medium,
                fontSize = 12.sp,
                lineHeight = 16.sp,
                letterSpacing = 0.sp,
            )
            Image(
                painter = painterResource(R.drawable.arrow_icon),
                contentDescription = "view all icon",
                modifier = Modifier
                    .padding(top = 3.dp, bottom = 3.dp, start = 4.dp)
                    .size(12.dp),
                colorFilter = ColorFilter.tint(BadgeCardBackGround)
            )
        }
    }
}

@Composable
fun TomSection() {
    Column(
        modifier = Modifier
            .padding(bottom = 12.dp)
    ) {
        Row(
            modifier = Modifier.padding(bottom = 12.dp)
        ) {
            TomCardItem(
                modifier = Modifier.weight(1F),
                title = "Sport Tom",
                description = "He runs 1 meter... trips over his boot.",
                oldPriceText = "5",
                newPriceText = "3 cheeses",
                tomImageResourceId = R.drawable.tom_image_2,
                tomImageContentDesc = "Tom Image 2",
                tomImageWidth = 93.33.dp
            )
            Spacer(Modifier.width(8.dp))
            TomCardItem(
                modifier = Modifier.weight(1F),
                title = "Tom the lover",
                description = "He loves one-sidedly... and is beaten by the other side.",
                newPriceText = "5 cheeses",
                tomImageResourceId = R.drawable.tom_image_3,
                tomImageContentDesc = "Tom Image 3",
                tomImageWidth = 98.44.dp
            )
        }

        Row(
            modifier = Modifier.padding(bottom = 12.dp)
        ) {
            TomCardItem(
                modifier = Modifier.weight(1F),
                title = "Tom the bomb",
                description = "He blows himself up before Jerry can catch him.",
                newPriceText = "10 cheeses",
                tomImageResourceId = R.drawable.tom_image_4,
                tomImageContentDesc = "Tom Image 4",
                tomImageWidth = 100.dp
            )
            Spacer(Modifier.width(8.dp))
            TomCardItem(
                modifier = Modifier.weight(1F),
                title = "Spy Tom",
                description = "Disguises itself as a table.",
                newPriceText = "12 cheeses",
                tomImageResourceId = R.drawable.tom_image_5,
                tomImageContentDesc = "Tom Image 5",
                tomImageWidth = 84.dp
            )
        }

        Row(
            modifier = Modifier.padding(bottom = 12.dp)
        ) {
            TomCardItem(
                modifier = Modifier.weight(1F),
                title = "Frozen Tom",
                description = "He was chasing Jerry, he froze after the first look\n",
                newPriceText = "10 cheeses",
                tomImageResourceId = R.drawable.tom_image_6,
                tomImageContentDesc = "Tom Image 6",
                tomImageWidth = 76.56.dp
            )
            Spacer(Modifier.width(8.dp))
            TomCardItem(
                modifier = Modifier.weight(1F),
                title = "Sleeping Tom",
                description = "He doesn't chase anyone, he just snores in stereo.\n",
                newPriceText = "10 cheeses",
                tomImageResourceId = R.drawable.tom_image_7,
                tomImageContentDesc = "Tom Image 7",
                tomImageWidth = 104.81.dp
            )
        }
    }
}

@Composable
fun TomCardItem(
    modifier: Modifier,
    title: String,
    description: String,
    oldPriceText: String? = null,
    newPriceText: String,
    tomImageResourceId: Int,
    tomImageContentDesc: String,
    tomImageWidth: Dp
) {
    Box(
        modifier = modifier
            .height(235.dp)
    ) {
        Box(
            modifier = Modifier.padding(top = 16.dp)
        ) {
            Column(
                modifier = Modifier
                    .clip(RoundedCornerShape(16.dp))
                    .background(TomCardBackGround)
                    .padding(start = 8.dp, end = 8.dp, bottom = 8.dp, top = 92.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = title,
                    fontFamily = IBMPlexSansArabicFont,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 18.sp,
                    letterSpacing = 0.sp,
                    lineHeight = 23.sp,
                    color = TitleColor,
                    overflow = TextOverflow.Ellipsis,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = description,
                    fontFamily = IBMPlexSansArabicFont,
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.sp,
                    lineHeight = 16.sp,
                    letterSpacing = 0.5.sp,
                    color = SearchTextColor,
                    textAlign = TextAlign.Center,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier
                        .weight(1f)

                )
                Spacer(Modifier.height(8.dp))
                Row(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .background(PriceCardColor)
                            .padding(horizontal = 8.dp, vertical = 6.dp)
                            .weight(1F),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Image(
                            painter = painterResource(R.drawable.money_icon),
                            contentDescription = "money icon",
                            modifier = Modifier.size(width = 16.dp, height = 16.dp)
                        )
                        Spacer(Modifier.width(4.dp))
                        if (oldPriceText != null) {
                            Text(
                                text = "$oldPriceText",
                                fontSize = 12.sp,
                                fontFamily = IBMPlexSansArabicFont,
                                fontWeight = FontWeight.Medium,
                                textDecoration = TextDecoration.LineThrough,
                                color = BadgeCardBackGround
                            )
                            Text(
                                text = " ",
                                fontSize = 12.sp,
                                fontFamily = IBMPlexSansArabicFont,
                                fontWeight = FontWeight.Medium,
                                color = BadgeCardBackGround
                            )
                        }
                        Text(
                            text = newPriceText,
                            fontSize = 12.sp,
                            fontFamily = IBMPlexSansArabicFont,
                            fontWeight = FontWeight.Medium,
                            color = BadgeCardBackGround
                        )
                    }
                    Spacer(Modifier.width(8.dp))
                    Box(
                        modifier = Modifier
                            .border(
                                width = 1.dp, color = BadgeCardBackGround,
                                shape = RoundedCornerShape(8.dp)
                            )
                            .size(30.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(R.drawable.add_to_cart_icon),
                            contentDescription = "purchase icon",
                            modifier = Modifier.size(width = 16.dp, height = 16.dp)
                        )
                    }
                }
            }
        }
        Image(
            painter = painterResource(tomImageResourceId),
            contentDescription = tomImageContentDesc,
            modifier = Modifier
                .size(width = tomImageWidth, height = 100.dp)
                .align(Alignment.TopCenter)
        )
    }
}

@Preview(widthDp = 360, heightDp = 772)
@Composable
fun JerryStorePreview() {
    JerryStore()
}
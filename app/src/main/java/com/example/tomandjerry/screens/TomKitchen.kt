package com.example.tomandjerry.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.AddToCartColor
import com.example.tomandjerry.ui.theme.BadgeCardBackGround
import com.example.tomandjerry.ui.theme.CardDetailsColor
import com.example.tomandjerry.ui.theme.DescriptionColor
import com.example.tomandjerry.ui.theme.IBMPlexSansArabicFont
import com.example.tomandjerry.ui.theme.MainBackgroundColor
import com.example.tomandjerry.ui.theme.StepColor
import com.example.tomandjerry.ui.theme.TitleColor
import com.example.tomandjerry.ui.theme.TomCardBackGround

@Composable
fun TomKitchen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(TomCardBackGround)
        ) {
            Image(
                painter = painterResource(R.drawable.tom_kitchen_image),
                contentDescription = "Tom Kitchen Background",
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.FillWidth,
            )
        }
        Column(
            modifier = Modifier
                .padding(top = 162.dp)
                .clip(RoundedCornerShape(16.dp, 16.dp, 0.dp, 0.dp))
                .background(MainBackgroundColor)
                .fillMaxSize()
        ) {
            Column(
                modifier = Modifier
                    .padding(top = 32.dp, start = 16.dp, end = 16.dp)
                    .verticalScroll(rememberScrollState())
                    .weight(1f)
            ) {
                Row {
                    Column(
                        modifier = Modifier.weight(1f)
                    ) {
                        Text(
                            text = "Electric Tom pasta",
                            fontFamily = IBMPlexSansArabicFont,
                            fontWeight = FontWeight.Medium,
                            fontSize = 20.sp,
                            color = TitleColor.copy(0.87f),
                            lineHeight = 16.sp,
                            style = TextStyle(
                                platformStyle = PlatformTextStyle(
                                    includeFontPadding = false
                                )
                            )
                        )
                        Box(
                            modifier = Modifier.padding(top = 6.dp)

                        ) {
                            Row(
                                modifier = Modifier
                                    .clip(RoundedCornerShape(8.dp))
                                    .background(CardDetailsColor)
                                    .padding(horizontal = 8.dp, vertical = 6.dp),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.Center
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.money_icon),
                                    contentDescription = "money icon",
                                    modifier = Modifier.size(16.dp)
                                )
                                Spacer(Modifier.width(4.dp))
                                Text(
                                    text = "5 cheeses",
                                    fontSize = 12.sp,
                                    fontFamily = IBMPlexSansArabicFont,
                                    fontWeight = FontWeight.Medium,
                                    color = BadgeCardBackGround
                                )
                            }
                        }
                    }

                    Image(
                        painter = painterResource(R.drawable.favourite_icon),
                        modifier = Modifier
                            .size(24.dp)
                            .align(Alignment.CenterVertically),
                        contentDescription = "Favourite icon",
                    )
                }

                Text(
                    text = "Pasta cooked with a charger cable and sprinkled with questionable cheese. Make sure to unplug it before eating (or not, you decide).",
                    modifier = Modifier.padding(top = 16.dp),
                    fontFamily = IBMPlexSansArabicFont,
                    fontSize = 14.sp,
                    color = DescriptionColor.copy((0.6F)),
                    lineHeight = 20.sp,
                    letterSpacing = 0.5.sp,
                    fontWeight = FontWeight.Medium
                )

                Text(
                    text = "Details",
                    modifier = Modifier.padding(top = 24.dp),
                    fontFamily = IBMPlexSansArabicFont,
                    fontWeight = FontWeight.Medium,
                    fontSize = 18.sp,
                    lineHeight = 16.sp,
                    letterSpacing = 0.5.sp,
                    style = TextStyle(
                        platformStyle = PlatformTextStyle(
                            includeFontPadding = false
                        )
                    ),
                    color = TitleColor.copy(0.87f)
                )
                Row(
                    modifier = Modifier
                        .padding(top = 8.dp)
                        .fillMaxWidth()
                        .horizontalScroll(rememberScrollState())
                ) {
                    DetailsItem(
                        modifier = Modifier.weight(1f),
                        iconResourceId = R.drawable.tempreture_icon,
                        iconDescription = "Temperature icon",
                        title = "Temperature",
                        value = "1000 V"
                    )
                    Spacer(Modifier.size(8.dp))
                    DetailsItem(
                        modifier = Modifier.weight(1f),
                        iconResourceId = R.drawable.time_icon,
                        iconDescription = "Time icon",
                        title = "Time",
                        value = "3 sparks"
                    )
                    Spacer(Modifier.size(8.dp))
                    DetailsItem(
                        modifier = Modifier.weight(1f),
                        iconResourceId = R.drawable.num_of_deaths_icon,
                        iconDescription = "No. of deaths icon",
                        title = "No. of deaths",
                        value = "1M 12K"
                    )
                }

                Spacer(Modifier.size(24.dp))

                Text(
                    text = "Preparation method",
                    fontFamily = IBMPlexSansArabicFont,
                    fontWeight = FontWeight.Medium,
                    fontSize = 18.sp,
                    lineHeight = 16.sp,
                    letterSpacing = 0.5.sp,
                    color = TitleColor.copy(0.87f),
                )

                Column(
                    modifier = Modifier.padding(top = 8.dp)
                ) {
                    PreparationItem(
                        1, "Put the pasta in a toaster."
                    )
                    PreparationItem(
                        2, "Pour battery juice over it."
                    )
                    PreparationItem(
                        3, "Wait for the spark to ignite."
                    )
                    PreparationItem(
                        4, "Serve with an insulating glove."
                    )
                    PreparationItem(
                        5, "Mix the ingredient together"
                    )
                    PreparationItem(
                        6, "Serve them with high quality"
                    )
                    PreparationItem(
                        7, "Serve them with high quality"
                    )
                    PreparationItem(
                        8, "Serve them with high quality"
                    )
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(86.dp)
                    .background(TomCardBackGround)
                    .topBorder(TitleColor.copy(0.12f), 1.dp)
                    .padding(top = 1.dp)
                    .padding(horizontal = 16.dp, vertical = 15.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(AddToCartColor),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Add to cart",
                    fontFamily = IBMPlexSansArabicFont,
                    fontWeight = FontWeight.Medium,
                    fontSize = 16.sp,
                    lineHeight = 16.sp,
                    letterSpacing = 0.5.sp,
                    color = TomCardBackGround.copy(0.87f)
                )

                Box(
                    modifier = Modifier
                        .padding(horizontal = 8.dp)
                        .size(5.dp)
                        .clip(RoundedCornerShape(100))
                        .background(TomCardBackGround.copy(0.38f))
                )

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "3 cheeses",
                        fontFamily = IBMPlexSansArabicFont,
                        fontWeight = FontWeight.Medium,
                        fontSize = 14.sp,
                        lineHeight = 16.sp,
                        letterSpacing = 0.5.sp,
                        color = TomCardBackGround
                    )
                    Text(
                        text = "5 cheeses",
                        fontFamily = IBMPlexSansArabicFont,
                        fontWeight = FontWeight.Medium,
                        fontSize = 12.sp,
                        lineHeight = 16.sp,
                        letterSpacing = 0.5.sp,
                        color = TomCardBackGround.copy(0.80f),
                        textDecoration = TextDecoration.LineThrough

                    )
                }
            }
        }

        Image(
            painter = painterResource(R.drawable.main_dish_image),
            contentDescription = "Tom Kitchen Background",
            modifier = Modifier
                .padding(top = 18.dp, end = 24.dp)
                .size(width = 188.dp, 168.dp)
                .align(Alignment.TopEnd)
        )

        Column(
            modifier = Modifier.padding(top = 40.dp, start = 16.dp)
        ) {
            Row {
                Image(
                    painter = painterResource(R.drawable.high_tension_icon),
                    contentDescription = "High tension icon"
                )
                Spacer(Modifier.width(8.dp))
                Text(
                    text = "High tension",
                    fontFamily = IBMPlexSansArabicFont,
                    fontWeight = FontWeight.Medium,
                    fontSize = 16.sp,
                    color = TomCardBackGround
                )
            }
            Spacer(Modifier.height(16.dp))
            Row {
                Image(
                    painter = painterResource(R.drawable.shocking_foods_icon),
                    contentDescription = "Shocking foods icon"
                )
                Spacer(Modifier.width(8.dp))
                Text(
                    text = "Shocking foods",
                    fontFamily = IBMPlexSansArabicFont,
                    fontWeight = FontWeight.Medium,
                    fontSize = 16.sp,
                    color = TomCardBackGround
                )
            }
        }

    }
}

@Composable
fun PreparationItem(stepNumber: Int, preparationText: String) {
    Box(
        modifier = Modifier
            .padding(end = 8.dp, bottom = 8.dp)
            .fillMaxWidth()
    ) {
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(12.dp))
                .padding(start = 18.dp, top = 2.dp, bottom = 2.dp)
                .fillMaxWidth()
                .defaultMinSize(minWidth = 1.dp, minHeight = 32.dp)
                .background(TomCardBackGround)
        ) {
            Text(
                text = preparationText,
                modifier = Modifier
                    .padding(start = 26.dp)
                    .align(Alignment.CenterStart),
                fontFamily = IBMPlexSansArabicFont,
                fontSize = 14.sp,
                color = DescriptionColor.copy((0.6F)),
                lineHeight = 16.sp,
                letterSpacing = 0.5.sp,
                fontWeight = FontWeight.Normal
            )
        }

        Box(
            modifier = Modifier
                .size(36.dp)
                .clip(RoundedCornerShape(100.dp))
                .background(TomCardBackGround)
                .border(
                    width = 1.dp,
                    color = CardDetailsColor,
                    shape = CircleShape
                )

        ) {
            Text(
                text = stepNumber.toString(),
                modifier = Modifier.align(Alignment.Center),
                fontFamily = IBMPlexSansArabicFont,
                fontSize = 12.sp,
                color = StepColor,
                lineHeight = 16.sp,
                letterSpacing = 0.5.sp,
                fontWeight = FontWeight.Medium,
            )
        }
    }
}

@Composable
fun DetailsItem(
    modifier: Modifier = Modifier,
    iconResourceId: Int,
    iconDescription: String,
    title: String,
    value: String
) {
    Box(
        modifier = modifier
            .aspectRatio(1f)
            .clip(RoundedCornerShape(12.dp))
            .background(CardDetailsColor),
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Box(
                modifier = Modifier.size(32.dp),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(iconResourceId),
                    contentDescription = iconDescription,
                )
            }
            Column {
                Text(
                    text = value,
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    fontFamily = IBMPlexSansArabicFont,
                    fontSize = 14.sp,
                    color = DescriptionColor.copy((0.6F)),
                    lineHeight = 16.sp,
                    letterSpacing = 0.5.sp,
                    fontWeight = FontWeight.Medium
                )
                Text(
                    text = title,
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    fontFamily = IBMPlexSansArabicFont,
                    fontSize = 12.sp,
                    color = DescriptionColor.copy((0.37F)),
                    lineHeight = 16.sp,
                    letterSpacing = 0.5.sp,
                    fontWeight = FontWeight.Medium
                )
            }
        }
    }
}

@Preview(widthDp = 360, heightDp = 772)
@Composable
fun TomKitchenPreview() {
    TomKitchen()
}


fun Modifier.topBorder(
    color: Color,
    strokeWidth: Dp = 1.dp
): Modifier = this.then(
    Modifier.drawBehind {
        val strokeWidthPx = strokeWidth.toPx()
        drawLine(
            color = color,
            start = androidx.compose.ui.geometry.Offset(0f, 0f),
            end = androidx.compose.ui.geometry.Offset(size.width, 0f),
            strokeWidth = strokeWidthPx
        )
    }
)
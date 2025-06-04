package com.example.tomandjerry.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.CardDetailsColor
import com.example.tomandjerry.ui.theme.ChaseItemColor
import com.example.tomandjerry.ui.theme.DescriptionColor
import com.example.tomandjerry.ui.theme.DividerColor
import com.example.tomandjerry.ui.theme.HeartBrokenItemColor
import com.example.tomandjerry.ui.theme.HuntingItemColor
import com.example.tomandjerry.ui.theme.IBMPlexSansArabicFont
import com.example.tomandjerry.ui.theme.MainBackgroundColor
import com.example.tomandjerry.ui.theme.TitleColor
import com.example.tomandjerry.ui.theme.TomCardBackGround

@Composable
fun TomAccount() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(TomCardBackGround)
    ) {
        Image(
            painter = painterResource(R.drawable.tom_account_background),
            contentDescription = "background image",
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.TopStart),
            contentScale = ContentScale.FillWidth
        )
        Header(
            Modifier
                .align(Alignment.TopCenter)
        )
        AccountDetails()
    }
}

@Composable
fun AccountDetails() {
    Column(
        modifier = Modifier
            .padding(top = 174.dp)
            .fillMaxSize()
            .clip(RoundedCornerShape(20.dp, 20.dp, 0.dp, 0.dp))
            .background(MainBackgroundColor)
    ) {
        StatisticsSection()
        TomSettings()
        Spacer(Modifier.height(12.dp))
        HorizontalDivider(
            color = DividerColor.copy(0.08f),
            thickness = 1.dp,
        )
        FavouriteSection()
        Spacer(Modifier.height(12.dp))
    }
}

@Composable
fun FavouriteSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 12.dp, start = 16.dp, end = 16.dp)
    ) {
        SectionTitle("His favorite foods")
        AccountItem(
            R.drawable.mouses,
            "Mouses"
        )
        Spacer(Modifier.height(4.dp))
        AccountItem(
            R.drawable.hamburger_02,
            "Last stolen meal"
        )
        Spacer(Modifier.height(4.dp))
        AccountItem(
            R.drawable.sleeping,
            "Change sleep mood"
        )

    }
}

@Composable
fun TomSettings() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 24.dp, start = 16.dp, end = 16.dp)
    ) {
        SectionTitle("Tom settings")
        AccountItem(
            R.drawable.bed_single_02,
            "Change sleeping place"
        )
        Spacer(Modifier.height(4.dp))
        AccountItem(
            R.drawable.cat,
            "Meow settings"
        )
        Spacer(Modifier.height(4.dp))
        AccountItem(
            R.drawable.fridge,
            "Password to open the fridge"
        )

    }
}

@Composable
fun AccountItem(
    imageResId: Int,
    text: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(40.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(TomCardBackGround),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(imageResId),
                contentDescription = "image"

            )
        }
        Text(
            text = text,
            fontFamily = IBMPlexSansArabicFont,
            fontWeight = FontWeight.Medium,
            fontSize = 16.sp,
            modifier = Modifier.padding(8.dp),
            color = TitleColor.copy(0.87f)
        )
    }
}

@Composable
fun SectionTitle(
    text: String
) {
    Text(
        text = text,
        fontFamily = IBMPlexSansArabicFont,
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        color = TitleColor.copy(0.87f)
    )
}

@Composable
fun StatisticsSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 23.dp, start = 16.dp, end = 16.dp)
    ) {
        GridItem(
            modifier = Modifier.weight(1f),
            imageResId = R.drawable.num_of_quarels_image,
            value = "2M 12K",
            title = "No. of quarrels",
            CardDetailsColor
        )
        GridItem(
            modifier = Modifier.weight(1f),
            imageResId = R.drawable.chase_time_image,
            value = "+500 h",
            title = "Chase time",
            ChaseItemColor
        )
    }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp, start = 16.dp, end = 16.dp)
    ) {
        GridItem(
            modifier = Modifier.weight(1f),
            imageResId = R.drawable.hunting_times_images,
            value = "2M 12K",
            title = "Hunting times",
            HuntingItemColor
        )
        GridItem(
            modifier = Modifier.weight(1f),
            imageResId = R.drawable.heart_broken_image,
            value = "3M 7K",
            title = "Heartbroken",
            HeartBrokenItemColor
        )
    }
}

@Composable
fun Header(
    modifier: Modifier
) {
    Column(
        modifier = modifier
            .padding(top = 16.dp, bottom = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.tom_account_image),
            contentDescription = "background image",
            modifier = Modifier.size(64.dp)
        )
        Text(
            text = "Tom",
            fontFamily = IBMPlexSansArabicFont,
            fontWeight = FontWeight.Medium,
            fontSize = 18.sp,
            lineHeight = 23.4.sp,
            letterSpacing = 0.sp,
            color = TomCardBackGround,
            modifier = Modifier.padding(top = 4.dp),
            textAlign = TextAlign.Center
        )

        Text(
            text = "specializes in failure!",
            fontFamily = IBMPlexSansArabicFont,
            fontWeight = FontWeight.Normal,
            fontSize = 12.sp,
            lineHeight = 21.6.sp,
            letterSpacing = 0.sp,
            color = TomCardBackGround.copy(0.8f),
            textAlign = TextAlign.Center
        )

        Box(
            modifier = Modifier
                .padding(top = 4.dp, start = 8.dp, end = 8.dp)
                .clip(RoundedCornerShape(40.dp))
                .background(TomCardBackGround.copy(0.12f))
        ) {
            Text(
                text = "Edit foolishness",
                fontFamily = IBMPlexSansArabicFont,
                fontWeight = FontWeight.Medium,
                fontSize = 10.sp,
                lineHeight = 13.sp,
                letterSpacing = 0.sp,
                color = TomCardBackGround,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp)
            )
        }

    }
}

@Composable
fun GridItem(
    modifier: Modifier,
    imageResId: Int,
    value: String,
    title: String,
    backgroundColor: Color
) {
    Row(
        modifier = modifier
            .padding(end = 8.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(backgroundColor)
            .padding(start = 12.dp, end = 10.dp, top = 8.dp, bottom = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(imageResId),
            contentDescription = "image",
            modifier = Modifier
                .size(40.dp)
                .align(Alignment.CenterVertically)
        )
        Column(
            modifier = Modifier.padding(
                start = 10.dp, top = 3.dp
            )
        ) {
            Text(
                text = value,
                fontFamily = IBMPlexSansArabicFont,
                fontWeight = FontWeight.SemiBold,
                fontSize = 16.sp,
                lineHeight = 16.sp,
                letterSpacing = 0.5.sp,
                color = DescriptionColor.copy(0.6f),
            )
            Text(
                text = title,
                fontFamily = IBMPlexSansArabicFont,
                fontWeight = FontWeight.Medium,
                fontSize = 12.sp,
                lineHeight = 16.sp,
                letterSpacing = 0.5.sp,
                overflow = TextOverflow.Ellipsis,
                maxLines = 1,
                color = DescriptionColor.copy(0.37f),
            )
        }
    }
}

@Preview(widthDp = 360, heightDp = 772)
@Composable
fun TomAccountPreview() {
    TomAccount()
}
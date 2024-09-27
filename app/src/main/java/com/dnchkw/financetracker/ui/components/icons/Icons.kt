package com.dnchkw.financetracker.ui.components.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

// Currencies

val CurrencyDollar: ImageVector
    get() {
        if (_CurrencyDollar != null) {
            return _CurrencyDollar!!
        }
        _CurrencyDollar = ImageVector.Builder(
            name = "CurrencyDollar",
            defaultWidth = 16.dp,
            defaultHeight = 16.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(4f, 10.781f)
                curveToRelative(0.1480f, 1.6670f, 1.5130f, 2.850f, 3.5910f, 3.0030f)
                verticalLineTo(15f)
                horizontalLineToRelative(1.043f)
                verticalLineToRelative(-1.216f)
                curveToRelative(2.270f, -0.1790f, 3.6780f, -1.4380f, 3.6780f, -3.30f)
                curveToRelative(00f, -1.590f, -0.9470f, -2.510f, -2.9560f, -3.0280f)
                lineToRelative(-0.722f, -0.187f)
                verticalLineTo(3.467f)
                curveToRelative(1.1220f, 0.110f, 1.8790f, 0.7140f, 2.070f, 1.6160f)
                horizontalLineToRelative(1.47f)
                curveToRelative(-0.1660f, -1.60f, -1.540f, -2.7480f, -3.540f, -2.8750f)
                verticalLineTo(1f)
                horizontalLineTo(7.591f)
                verticalLineToRelative(1.233f)
                curveToRelative(-1.9390f, 0.230f, -3.270f, 1.4720f, -3.270f, 3.1560f)
                curveToRelative(00f, 1.4540f, 0.9660f, 2.4830f, 2.6610f, 2.9170f)
                lineToRelative(0.61f, 0.162f)
                verticalLineToRelative(4.031f)
                curveToRelative(-1.1490f, -0.170f, -1.940f, -0.80f, -2.1310f, -1.7180f)
                close()
                moveToRelative(3.391f, -3.836f)
                curveToRelative(-1.0430f, -0.2630f, -1.60f, -0.8250f, -1.60f, -1.6160f)
                curveToRelative(00f, -0.9440f, 0.7040f, -1.6410f, 1.80f, -1.8280f)
                verticalLineToRelative(3.495f)
                lineToRelative(-0.2f, -0.05f)
                close()
                moveToRelative(1.591f, 1.872f)
                curveToRelative(1.2870f, 0.3230f, 1.8520f, 0.8590f, 1.8520f, 1.7690f)
                curveToRelative(00f, 1.0970f, -0.8260f, 1.8280f, -2.20f, 1.9390f)
                verticalLineTo(8.73f)
                close()
            }
        }.build()
        return _CurrencyDollar!!
    }

private var _CurrencyDollar: ImageVector? = null



val Currency_ruble: ImageVector
    get() {
        if (_Currency_ruble != null) {
            return _Currency_ruble!!
        }
        _Currency_ruble = ImageVector.Builder(
            name = "Currency_ruble",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(280f, 840f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(260f)
                quadToRelative(92f, 0f, 156f, 64f)
                reflectiveQuadToRelative(64f, 156f)
                reflectiveQuadToRelative(-64f, 156f)
                reflectiveQuadToRelative(-156f, 64f)
                horizontalLineTo(360f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(360f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(80f, -360f)
                horizontalLineToRelative(180f)
                quadToRelative(58f, 0f, 99f, -41f)
                reflectiveQuadToRelative(41f, -99f)
                reflectiveQuadToRelative(-41f, -99f)
                reflectiveQuadToRelative(-99f, -41f)
                horizontalLineTo(360f)
                close()
            }
        }.build()
        return _Currency_ruble!!
    }

private var _Currency_ruble: ImageVector? = null


public val Euro_symbol: ImageVector
    get() {
        if (_Euro_symbol != null) {
            return _Euro_symbol!!
        }
        _Euro_symbol = ImageVector.Builder(
            name = "Euro_symbol",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(600f, 840f)
                quadToRelative(-118f, 0f, -210f, -67f)
                reflectiveQuadTo(260f, 600f)
                horizontalLineTo(120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(122f)
                quadToRelative(-2f, -11f, -2f, -20f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -9f, 2f, -20f)
                horizontalLineTo(120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(140f)
                quadToRelative(38f, -106f, 130f, -173f)
                reflectiveQuadToRelative(210f, -67f)
                quadToRelative(69f, 0f, 130.5f, 24f)
                reflectiveQuadTo(840f, 212f)
                lineToRelative(-70f, 70f)
                quadToRelative(-35f, -29f, -78.5f, -45.5f)
                reflectiveQuadTo(600f, 220f)
                quadToRelative(-75f, 0f, -136.5f, 38.5f)
                reflectiveQuadTo(370f, 360f)
                horizontalLineToRelative(230f)
                verticalLineToRelative(80f)
                horizontalLineTo(344f)
                quadToRelative(-2f, 11f, -3f, 20f)
                reflectiveQuadToRelative(-1f, 20f)
                reflectiveQuadToRelative(1f, 20f)
                reflectiveQuadToRelative(3f, 20f)
                horizontalLineToRelative(256f)
                verticalLineToRelative(80f)
                horizontalLineTo(370f)
                quadToRelative(32f, 63f, 93.5f, 101.5f)
                reflectiveQuadTo(600f, 740f)
                quadToRelative(48f, 0f, 92.5f, -16.5f)
                reflectiveQuadTo(770f, 678f)
                lineToRelative(70f, 70f)
                quadToRelative(-48f, 44f, -109.5f, 68f)
                reflectiveQuadTo(600f, 840f)
            }
        }.build()
        return _Euro_symbol!!
    }

private var _Euro_symbol: ImageVector? = null






// Expenses




val CashCoin: ImageVector
    get() {
        if (_CashCoin != null) {
            return _CashCoin!!
        }
        _CashCoin = ImageVector.Builder(
            name = "CashCoin",
            defaultWidth = 16.dp,
            defaultHeight = 16.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11f, 15f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -8f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 8f)
                moveToRelative(5f, -4f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -10f, 0f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(9.438f, 11.944f)
                curveToRelative(0.0470f, 0.5960f, 0.5180f, 1.060f, 1.3630f, 1.1160f)
                verticalLineToRelative(0.44f)
                horizontalLineToRelative(0.375f)
                verticalLineToRelative(-0.443f)
                curveToRelative(0.8750f, -0.0610f, 1.3860f, -0.5290f, 1.3860f, -1.2070f)
                curveToRelative(00f, -0.6180f, -0.390f, -0.9360f, -1.090f, -1.10f)
                lineToRelative(-0.296f, -0.07f)
                verticalLineToRelative(-1.2f)
                curveToRelative(0.3760f, 0.0430f, 0.6140f, 0.2480f, 0.6710f, 0.5320f)
                horizontalLineToRelative(0.658f)
                curveToRelative(-0.0470f, -0.5750f, -0.540f, -1.0240f, -1.3290f, -1.0730f)
                verticalLineTo(8.5f)
                horizontalLineToRelative(-0.375f)
                verticalLineToRelative(0.45f)
                curveToRelative(-0.7470f, 0.0730f, -1.2550f, 0.5220f, -1.2550f, 1.1580f)
                curveToRelative(00f, 0.5620f, 0.3780f, 0.920f, 1.0070f, 1.0660f)
                lineToRelative(0.248f, 0.061f)
                verticalLineToRelative(1.272f)
                curveToRelative(-0.3840f, -0.0580f, -0.6390f, -0.270f, -0.6960f, -0.5630f)
                horizontalLineToRelative(-0.668f)
                close()
                moveToRelative(1.36f, -1.354f)
                curveToRelative(-0.3690f, -0.0850f, -0.5690f, -0.260f, -0.5690f, -0.5220f)
                curveToRelative(00f, -0.2940f, 0.2160f, -0.5140f, 0.5720f, -0.5780f)
                verticalLineToRelative(1.1f)
                close()
                moveToRelative(0.432f, 0.746f)
                curveToRelative(0.4490f, 0.1040f, 0.6550f, 0.2720f, 0.6550f, 0.5690f)
                curveToRelative(00f, 0.3390f, -0.2570f, 0.5710f, -0.7090f, 0.6140f)
                verticalLineToRelative(-1.195f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                horizontalLineToRelative(4.083f)
                quadToRelative(0.088f, -0.517f, 0.258f, -1f)
                horizontalLineTo(3f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2f)
                verticalLineTo(3f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
                horizontalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                verticalLineToRelative(3.528f)
                curveToRelative(0.380f, 0.340f, 0.7170f, 0.7280f, 10f, 1.1540f)
                verticalLineTo(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(9.998f, 5.083f)
                lineTo(10f, 5f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3.132f, 1.65f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.13f, -1.567f)
            }
        }.build()
        return _CashCoin!!
    }

private var _CashCoin: ImageVector? = null



public val Local_dining: ImageVector
    get() {
        if (_Local_dining != null) {
            return _Local_dining!!
        }
        _Local_dining = ImageVector.Builder(
            name = "Local_dining",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(175f, 840f)
                lineToRelative(-56f, -56f)
                lineToRelative(410f, -410f)
                quadToRelative(-18f, -42f, -5f, -95f)
                reflectiveQuadToRelative(57f, -95f)
                quadToRelative(53f, -53f, 118f, -62f)
                reflectiveQuadToRelative(106f, 32f)
                reflectiveQuadToRelative(32f, 106f)
                reflectiveQuadToRelative(-62f, 118f)
                quadToRelative(-42f, 44f, -95f, 57f)
                reflectiveQuadToRelative(-95f, -5f)
                lineToRelative(-50f, 50f)
                lineToRelative(304f, 304f)
                lineToRelative(-56f, 56f)
                lineToRelative(-304f, -302f)
                close()
                moveToRelative(118f, -342f)
                lineTo(173f, 378f)
                quadToRelative(-54f, -54f, -54f, -129f)
                reflectiveQuadToRelative(54f, -129f)
                lineToRelative(248f, 250f)
                close()
            }
        }.build()
        return _Local_dining!!
    }

private var _Local_dining: ImageVector? = null


public val In_home_mode: ImageVector
    get() {
        if (_In_home_mode != null) {
            return _In_home_mode!!
        }
        _In_home_mode = ImageVector.Builder(
            name = "In_home_mode",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(160f, 800f)
                verticalLineToRelative(-375f)
                lineToRelative(-72f, 55f)
                lineToRelative(-47f, -63f)
                lineToRelative(439f, -337f)
                lineToRelative(440f, 336f)
                lineToRelative(-48f, 64f)
                lineToRelative(-392f, -300f)
                lineToRelative(-240f, 184f)
                verticalLineToRelative(356f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(437f, 80f)
                lineTo(428f, 710f)
                lineToRelative(56f, -57f)
                lineToRelative(113f, 113f)
                lineToRelative(227f, -226f)
                lineToRelative(56f, 57f)
                close()
            }
        }.build()
        return _In_home_mode!!
    }

private var _In_home_mode: ImageVector? = null

public val Commute: ImageVector
    get() {
        if (_Commute != null) {
            return _Commute!!
        }
        _Commute = ImageVector.Builder(
            name = "Commute",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(400f, 774f)
                verticalLineToRelative(-228f)
                lineToRelative(56f, -160f)
                quadToRelative(5f, -11f, 14.5f, -18.5f)
                reflectiveQuadTo(494f, 360f)
                horizontalLineToRelative(292f)
                quadToRelative(14f, 0f, 24f, 7.5f)
                reflectiveQuadToRelative(14f, 18.5f)
                lineToRelative(56f, 160f)
                verticalLineToRelative(228f)
                quadToRelative(0f, 11f, -7.5f, 18.5f)
                reflectiveQuadTo(854f, 800f)
                horizontalLineToRelative(-28f)
                quadToRelative(-11f, 0f, -18.5f, -7.5f)
                reflectiveQuadTo(800f, 774f)
                verticalLineToRelative(-34f)
                horizontalLineTo(480f)
                verticalLineToRelative(34f)
                quadToRelative(0f, 11f, -7.5f, 18.5f)
                reflectiveQuadTo(454f, 800f)
                horizontalLineToRelative(-28f)
                quadToRelative(-11f, 0f, -18.5f, -7.5f)
                reflectiveQuadTo(400f, 774f)
                moveToRelative(80f, -274f)
                horizontalLineToRelative(320f)
                lineToRelative(-28f, -80f)
                horizontalLineTo(508f)
                close()
                moveToRelative(-20f, 60f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(60f, 100f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(560f, 620f)
                reflectiveQuadToRelative(-11.5f, -28.5f)
                reflectiveQuadTo(520f, 580f)
                reflectiveQuadToRelative(-28.5f, 11.5f)
                reflectiveQuadTo(480f, 620f)
                reflectiveQuadToRelative(11.5f, 28.5f)
                reflectiveQuadTo(520f, 660f)
                moveToRelative(240f, 0f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(800f, 620f)
                reflectiveQuadToRelative(-11.5f, -28.5f)
                reflectiveQuadTo(760f, 580f)
                reflectiveQuadToRelative(-28.5f, 11.5f)
                reflectiveQuadTo(720f, 620f)
                reflectiveQuadToRelative(11.5f, 28.5f)
                reflectiveQuadTo(760f, 660f)
                moveTo(160f, 800f)
                verticalLineToRelative(-40f)
                lineToRelative(40f, -40f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -66f, 59f, -93f)
                reflectiveQuadToRelative(201f, -27f)
                quadToRelative(148f, 0f, 204f, 26f)
                reflectiveQuadToRelative(56f, 94f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-40f)
                horizontalLineTo(160f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(280f)
                close()
                moveToRelative(40f, -160f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(240f, 600f)
                reflectiveQuadToRelative(-11.5f, -28.5f)
                reflectiveQuadTo(200f, 560f)
                reflectiveQuadToRelative(-28.5f, 11.5f)
                reflectiveQuadTo(160f, 600f)
                reflectiveQuadToRelative(11.5f, 28.5f)
                reflectiveQuadTo(200f, 640f)
                moveToRelative(260f, 40f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(-120f)
                horizontalLineTo(460f)
                close()
            }
        }.build()
        return _Commute!!
    }

private var _Commute: ImageVector? = null


public val Heart_check: ImageVector
    get() {
        if (_Heart_check != null) {
            return _Heart_check!!
        }
        _Heart_check = ImageVector.Builder(
            name = "Heart_check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(718f, 647f)
                lineTo(604f, 534f)
                lineToRelative(57f, -56f)
                lineToRelative(57f, 56f)
                lineToRelative(141f, -141f)
                lineToRelative(57f, 56f)
                close()
                moveTo(440f, 840f)
                lineTo(313f, 726f)
                quadToRelative(-72f, -65f, -123.5f, -116f)
                reflectiveQuadToRelative(-85f, -96f)
                reflectiveQuadToRelative(-49f, -87f)
                reflectiveQuadTo(40f, 339f)
                quadToRelative(0f, -94f, 63f, -156.5f)
                reflectiveQuadTo(260f, 120f)
                quadToRelative(52f, 0f, 99f, 22f)
                reflectiveQuadToRelative(81f, 62f)
                quadToRelative(34f, -40f, 81f, -62f)
                reflectiveQuadToRelative(99f, -22f)
                quadToRelative(81f, 0f, 136f, 45.5f)
                reflectiveQuadTo(831f, 280f)
                horizontalLineToRelative(-85f)
                quadToRelative(-18f, -40f, -53f, -60f)
                reflectiveQuadToRelative(-73f, -20f)
                quadToRelative(-51f, 0f, -88f, 27.5f)
                reflectiveQuadTo(463f, 300f)
                horizontalLineToRelative(-46f)
                quadToRelative(-31f, -45f, -70.5f, -72.5f)
                reflectiveQuadTo(260f, 200f)
                quadToRelative(-57f, 0f, -98.5f, 39.5f)
                reflectiveQuadTo(120f, 339f)
                quadToRelative(0f, 33f, 14f, 67f)
                reflectiveQuadToRelative(50f, 78.5f)
                reflectiveQuadToRelative(98f, 104f)
                reflectiveQuadTo(440f, 732f)
                quadToRelative(26f, -23f, 61f, -53f)
                reflectiveQuadToRelative(56f, -50f)
                lineToRelative(9f, 9f)
                lineToRelative(19.5f, 19.5f)
                lineTo(605f, 677f)
                lineToRelative(9f, 9f)
                quadToRelative(-22f, 20f, -56f, 49.5f)
                reflectiveQuadTo(498f, 788f)
                close()
            }
        }.build()
        return _Heart_check!!
    }

private var _Heart_check: ImageVector? = null


public val Shopping_bag: ImageVector
    get() {
        if (_Shopping_bag != null) {
            return _Shopping_bag!!
        }
        _Shopping_bag = ImageVector.Builder(
            name = "Shopping_bag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(240f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 240f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                reflectiveQuadToRelative(113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                horizontalLineToRelative(80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 320f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 880f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 440f)
                reflectiveQuadToRelative(-28.5f, -11.5f)
                reflectiveQuadTo(560f, 400f)
                verticalLineToRelative(-80f)
                horizontalLineTo(400f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(360f, 440f)
                reflectiveQuadToRelative(-28.5f, -11.5f)
                reflectiveQuadTo(320f, 400f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(160f, -560f)
                horizontalLineToRelative(160f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 160f)
                reflectiveQuadToRelative(-56.5f, 23.5f)
                reflectiveQuadTo(400f, 240f)
                moveTo(240f, 800f)
                verticalLineToRelative(-480f)
                close()
            }
        }.build()
        return _Shopping_bag!!
    }

private var _Shopping_bag: ImageVector? = null


public val Videogame_asset: ImageVector
    get() {
        if (_Videogame_asset != null) {
            return _Videogame_asset!!
        }
        _Videogame_asset = ImageVector.Builder(
            name = "Videogame_asset",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(160f, 720f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 640f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 240f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 320f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 720f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-320f)
                horizontalLineTo(160f)
                close()
                moveToRelative(120f, -40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                close()
                moveToRelative(300f, 0f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(640f, 540f)
                reflectiveQuadToRelative(-17.5f, -42.5f)
                reflectiveQuadTo(580f, 480f)
                reflectiveQuadToRelative(-42.5f, 17.5f)
                reflectiveQuadTo(520f, 540f)
                reflectiveQuadToRelative(17.5f, 42.5f)
                reflectiveQuadTo(580f, 600f)
                moveToRelative(120f, -120f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(760f, 420f)
                reflectiveQuadToRelative(-17.5f, -42.5f)
                reflectiveQuadTo(700f, 360f)
                reflectiveQuadToRelative(-42.5f, 17.5f)
                reflectiveQuadTo(640f, 420f)
                reflectiveQuadToRelative(17.5f, 42.5f)
                reflectiveQuadTo(700f, 480f)
                moveTo(160f, 640f)
                verticalLineToRelative(-320f)
                close()
            }
        }.build()
        return _Videogame_asset!!
    }

private var _Videogame_asset: ImageVector? = null



public val Book_2: ImageVector
    get() {
        if (_Book_2 != null) {
            return _Book_2!!
        }
        _Book_2 = ImageVector.Builder(
            name = "Book_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(300f, 880f)
                quadToRelative(-58f, 0f, -99f, -41f)
                reflectiveQuadToRelative(-41f, -99f)
                verticalLineToRelative(-520f)
                quadToRelative(0f, -58f, 41f, -99f)
                reflectiveQuadToRelative(99f, -41f)
                horizontalLineToRelative(500f)
                verticalLineToRelative(600f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(740f, 740f)
                reflectiveQuadToRelative(17.5f, 42.5f)
                reflectiveQuadTo(800f, 800f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(-60f, -267f)
                quadToRelative(14f, -7f, 29f, -10f)
                reflectiveQuadToRelative(31f, -3f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(-20f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(240f, 220f)
                close()
                moveToRelative(160f, -13f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-440f)
                horizontalLineTo(400f)
                close()
                moveToRelative(-160f, 13f)
                verticalLineToRelative(-453f)
                close()
                moveToRelative(60f, 187f)
                horizontalLineToRelative(373f)
                quadToRelative(-6f, -14f, -9.5f, -28.5f)
                reflectiveQuadTo(660f, 740f)
                quadToRelative(0f, -16f, 3f, -31f)
                reflectiveQuadToRelative(10f, -29f)
                horizontalLineTo(300f)
                quadToRelative(-26f, 0f, -43f, 17.5f)
                reflectiveQuadTo(240f, 740f)
                quadToRelative(0f, 26f, 17f, 43f)
                reflectiveQuadToRelative(43f, 17f)
            }
        }.build()
        return _Book_2!!
    }

private var _Book_2: ImageVector? = null


public val Wifi: ImageVector
    get() {
        if (_Wifi != null) {
            return _Wifi!!
        }
        _Wifi = ImageVector.Builder(
            name = "Wifi",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(480f, 840f)
                quadToRelative(-42f, 0f, -71f, -29f)
                reflectiveQuadToRelative(-29f, -71f)
                reflectiveQuadToRelative(29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                reflectiveQuadToRelative(71f, 29f)
                reflectiveQuadToRelative(29f, 71f)
                reflectiveQuadToRelative(-29f, 71f)
                reflectiveQuadToRelative(-71f, 29f)
                moveTo(254f, 614f)
                lineToRelative(-84f, -86f)
                quadToRelative(59f, -59f, 138.5f, -93.5f)
                reflectiveQuadTo(480f, 400f)
                reflectiveQuadToRelative(171.5f, 35f)
                reflectiveQuadTo(790f, 530f)
                lineToRelative(-84f, 84f)
                quadToRelative(-44f, -44f, -102f, -69f)
                reflectiveQuadToRelative(-124f, -25f)
                reflectiveQuadToRelative(-124f, 25f)
                reflectiveQuadToRelative(-102f, 69f)
                moveTo(84f, 444f)
                lineTo(0f, 360f)
                quadToRelative(92f, -94f, 215f, -147f)
                reflectiveQuadToRelative(265f, -53f)
                reflectiveQuadToRelative(265f, 53f)
                reflectiveQuadToRelative(215f, 147f)
                lineToRelative(-84f, 84f)
                quadToRelative(-77f, -77f, -178.5f, -120.5f)
                reflectiveQuadTo(480f, 280f)
                reflectiveQuadToRelative(-217.5f, 43.5f)
                reflectiveQuadTo(84f, 444f)
            }
        }.build()
        return _Wifi!!
    }

private var _Wifi: ImageVector? = null


public val Gift: ImageVector
    get() {
        if (_Gift != null) {
            return _Gift!!
        }
        _Gift = ImageVector.Builder(
            name = "Gift",
            defaultWidth = 16.dp,
            defaultHeight = 16.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(3f, 2.5f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 0f)
                verticalLineToRelative(0.006f)
                curveToRelative(00f, 0.070f, 00f, 0.270f, -0.0380f, 0.4940f)
                horizontalLineTo(15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                verticalLineToRelative(7.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 1.5f)
                horizontalLineToRelative(-11f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 14.5f)
                verticalLineTo(7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                verticalLineTo(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(2.038f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 2.506f)
                close()
                moveToRelative(1.068f, 0.5f)
                horizontalLineTo(7f)
                verticalLineToRelative(-0.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3f, 0f)
                curveToRelative(00f, 0.0850f, 0.0020f, 0.2740f, 0.0450f, 0.430f)
                close()
                moveTo(9f, 3f)
                horizontalLineToRelative(2.932f)
                lineToRelative(0.023f, -0.07f)
                curveToRelative(0.0430f, -0.1560f, 0.0450f, -0.3450f, 0.0450f, -0.430f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
                close()
                moveTo(1f, 4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineTo(4f)
                close()
                moveToRelative(8f, 0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineTo(4f)
                close()
                moveToRelative(5f, 3f)
                horizontalLineTo(9f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.5f, -0.5f)
                close()
                moveToRelative(-7f, 8f)
                verticalLineTo(7f)
                horizontalLineTo(2f)
                verticalLineToRelative(7.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.5f, 0.5f)
                close()
            }
        }.build()
        return _Gift!!
    }

private var _Gift: ImageVector? = null


public val Person: ImageVector
    get() {
        if (_Person != null) {
            return _Person!!
        }
        _Person = ImageVector.Builder(
            name = "Person",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(480f, 480f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                reflectiveQuadToRelative(47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                reflectiveQuadToRelative(113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                reflectiveQuadToRelative(-47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                moveTo(160f, 800f)
                verticalLineToRelative(-112f)
                quadToRelative(0f, -34f, 17.5f, -62.5f)
                reflectiveQuadTo(224f, 582f)
                quadToRelative(62f, -31f, 126f, -46.5f)
                reflectiveQuadTo(480f, 520f)
                reflectiveQuadToRelative(130f, 15.5f)
                reflectiveQuadTo(736f, 582f)
                quadToRelative(29f, 15f, 46.5f, 43.5f)
                reflectiveQuadTo(800f, 688f)
                verticalLineToRelative(112f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-32f)
                quadToRelative(0f, -11f, -5.5f, -20f)
                reflectiveQuadTo(700f, 654f)
                quadToRelative(-54f, -27f, -109f, -40.5f)
                reflectiveQuadTo(480f, 600f)
                reflectiveQuadToRelative(-111f, 13.5f)
                reflectiveQuadTo(260f, 654f)
                quadToRelative(-9f, 5f, -14.5f, 14f)
                reflectiveQuadToRelative(-5.5f, 20f)
                close()
                moveToRelative(240f, -320f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 320f)
                reflectiveQuadToRelative(-23.5f, -56.5f)
                reflectiveQuadTo(480f, 240f)
                reflectiveQuadToRelative(-56.5f, 23.5f)
                reflectiveQuadTo(400f, 320f)
                reflectiveQuadToRelative(23.5f, 56.5f)
                reflectiveQuadTo(480f, 400f)
                moveToRelative(0f, 320f)
            }
        }.build()
        return _Person!!
    }

private var _Person: ImageVector? = null










// Transactions


public val ArrowUpRight: ImageVector
    get() {
        if (_ArrowUpRight != null) {
            return _ArrowUpRight!!
        }
        _ArrowUpRight = ImageVector.Builder(
            name = "ArrowUpRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF0F172A)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(4.5f, 19.5f)
                lineTo(19.5f, 4.5f)
                moveTo(19.5f, 4.5f)
                lineTo(8.25f, 4.5f)
                moveTo(19.5f, 4.5f)
                verticalLineTo(15.75f)
            }
        }.build()
        return _ArrowUpRight!!
    }

private var _ArrowUpRight: ImageVector? = null


public val ArrowDownRight: ImageVector
    get() {
        if (_ArrowDownRight != null) {
            return _ArrowDownRight!!
        }
        _ArrowDownRight = ImageVector.Builder(
            name = "ArrowDownRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF0F172A)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(4.5f, 4.5f)
                lineTo(19.5f, 19.5f)
                moveTo(19.5f, 19.5f)
                verticalLineTo(8.25f)
                moveTo(19.5f, 19.5f)
                horizontalLineTo(8.25f)
            }
        }.build()
        return _ArrowDownRight!!
    }

private var _ArrowDownRight: ImageVector? = null

// Other


public val Filter_list: ImageVector
    get() {
        if (_Filter_list != null) {
            return _Filter_list!!
        }
        _Filter_list = ImageVector.Builder(
            name = "Filter_list",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(400f, 720f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                close()
                moveTo(240f, 520f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(80f)
                close()
                moveTo(120f, 320f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        return _Filter_list!!
    }

private var _Filter_list: ImageVector? = null


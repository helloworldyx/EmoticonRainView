### 表情雨控件概述
---
通过重写View#onDraw()方法实现。支持多个表情轮流下落和动画结束自动回收Bitmap。

![image](https://github.com/helloworldyx/EmoticonRainView/blob/master/show.gif)

### 使用方法
---
1. 在XML文件中声明表情雨控件，如：
```xml
   <com.nope.hyx.rain.EmoticonRainView
        android:id="@+id/emoticon_rain_view"
        android:layout_width="match_parent"
        android:layout_height="match_parent"/>
```
2. 传入配置，调用EmoticonRainView#start(Conf)方法。PS:Conf可自行扩展
```java
    EmoticonRainView.Conf conf = new EmoticonRainView.Conf.Builder().bitmaps(bitmaps)
        .emoticonHeightPixel(dp50Pixel).emoticonWidthPixel(dp50Pixel).build();
    rainView.start(conf);
```

### 注意事项
---
1. 控件默认开启动画结束后自动回收传入的Bitmap，如不需此功能，调用EmoticonRainView#setAutoRecycleBitmap(false);关闭
2. 传入的Bitmap请自行进行压缩，以减少内存占用，Conf类中的emoticonHeightPixel、emoticonWidthPixel仅单纯限定表情显示的宽高

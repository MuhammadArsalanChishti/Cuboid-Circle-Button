[ ![Download](https://api.bintray.com/packages/muhammadarsalanchishti/maven/CircleButton/images/download.svg) ](https://bintray.com/muhammadarsalanchishti/maven/CircleButton/_latestVersion)[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-Cuboid--Circle--Button-brightgreen.svg?style=flat)](http://android-arsenal.com/details/1/4129)

# Cuboid-Circle-Button
![alt tag](https://drive.google.com/uc?export=view&id=0B9zPkaTxGxJFendkcnI0VE1tMTQ)

![alt tag](https://drive.google.com/uc?export=view&id=0B9zPkaTxGxJFNzhBZUFWVmFtNlU)

### Gradle dependency  ```build.gradle```
```
dependencies {
    compile 'com.cuboid:cuboidcirclebutton:1.0.3'
}
```
### Android Circle Buttons with Attributes

``cub_color``, ``cub_hover_color``, ``cub_border_color``, ``cub_icon``, ``cub_border_radius``,``cub_fontstyle``,``cub_riple_effect``

## Buttons XML Code

### Default

```
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
            xmlns:app="http://schemas.android.com/apk/res-auto"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:background="#dcdcdc"
    >
        <com.cuboid.cuboidcirclebutton.CuboidButton
            android:layout_width="120dp"
            android:layout_height="120dp"
            android:textColor="@android:color/white"
            android:text="default"
            android:textSize="14dp"
            android:id="@+id/cuboidButton" />
</LinearLayout>
```
### No Border and Hover
```
            <com.cuboid.cuboidcirclebutton.CuboidButton
                android:layout_width="120dp"
                android:layout_height="120dp"
                android:layout_centerInParent="true"
                android:text="No Border"
                android:textColor="#000000"
                android:textSize="18sp"
                app:cub_border_radius="0dp"
                app:cub_color="@color/color_03A9F4"
                app:cub_fontstyle="fonts/Bellerose.ttf"
                app:cub_hover_color="#00BFFF1"
                />
```

### No Border, Hover and Icon
```
            <com.cuboid.cuboidcirclebutton.CuboidButton
                android:layout_width="120dp"
                android:layout_height="120dp"
                android:text="No Border"
                android:textColor="@android:color/white"
                android:textSize="14dp"
                app:cub_border_radius="0dp"
                app:cub_color="@color/color_37718E"
                app:cub_fontstyle="fonts/Bellerose.ttf"
                app:cub_hover_color="@color/color_59C3C3"
                app:cub_icon="@drawable/ic_settings"
                />
```

### Border and Hover
```
            <com.cuboid.cuboidcirclebutton.CuboidButton
                android:layout_width="120dp"
                android:layout_height="120dp"
                android:text="Border"
                android:textColor="@color/color_00796B"
                android:textSize="18sp"
                app:cub_border_color="@color/color_4CAF50"
                app:cub_border_radius="4dp"
                app:cub_color="@color/color_8BC34A"
                app:cub_fontstyle="fonts/BunyaRegular.ttf"
                app:cub_hover_color="@color/color_388E3C"
                />
```

### Border, Hover and Icon
```
            <com.cuboid.cuboidcirclebutton.CuboidButton
                android:layout_width="120dp"
                android:layout_height="120dp"
                android:layout_centerInParent="true"
                android:text="No Border"
                android:textColor="@android:color/white"
                android:textSize="14dp"
                app:cub_border_color="@color/color_00796B"
                app:cub_border_radius="4dp"
                app:cub_color="@color/color_009688"
                app:cub_fontstyle="fonts/Bellerose.ttf"
                app:cub_hover_color="@color/color_00796B"
                app:cub_icon="@drawable/ic_camera"
                />
```
### No Border, Hover and Ripple effect
```
        <com.cuboid.cuboidcirclebutton.CuboidButton
            android:layout_width="120dp"
            android:layout_height="120dp"
            android:layout_centerInParent="true"
            android:text="No Border"
            android:textColor="@android:color/white"
            android:textSize="16sp"
            app:cub_border_radius="0dp"
            app:cub_color="@color/color_F57C00"
            app:cub_hover_color="@color/color_FF5722"
            android:layout_marginRight="20dp"
            app:cub_riple_effect="true"
            />
```

### Border, Hover, Icon and Ripple effect
```
        <com.cuboid.cuboidcirclebutton.CuboidButton
            android:layout_width="120dp"
            android:layout_height="120dp"
            android:layout_centerInParent="true"
            android:text="No Border"
            android:textColor="@android:color/white"
            android:textSize="14dp"
            app:cub_border_color="@color/color_4062BB"
            app:cub_border_radius="4dp"
            app:cub_color="@color/color_59C3C3"
            app:cub_fontstyle="fonts/Bellerose.ttf"
            app:cub_hover_color="@color/colorAccent2"
            app:cub_icon="@drawable/icon_android"
            app:cub_riple_effect="true"
            />
```

# LICENSE Apache-2.0

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

### Developed By

Muhammad Arsalan Chishti.  
E-mail: at <arsalanchishti4@gmail.com>

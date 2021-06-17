### Android 工程支持 Kotlin 分两步

1. Gradle 添加 Kotlin 编译插件
    1. project 下的 build.gradle 里面添加：
    ```groovy
    classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version"
    ```
    2. module 下的 build.gradle 中添加：
    ```groovy
    apply plugin: 'kotlin-android'
    ```
2. Gradle 添加 Kotlin 标准库依赖
    - module 下的 build.gradle 中添加：
    ```groovy
    implementation "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlin_version"
    ```

### Gradle 常见问题解决

1. Gradle 下载不下来
2. 依赖下载不下来
3. Gradle Sync failed 怎么办？


#### 1. gradle-wrapper.properties 中下载不下来

1. 复制 gradle-wrapper.properties 配置文件的 distributionUrl 地址：
   ```
   distributionUrl=https\://services.gradle.org/distributions/gradle-6.7-bin.zip
   ```

2. 然后用浏览器打开地址（https://services.gradle.org/distributions/gradle-6.7-bin.zip）下载，下载路径到，用户下的 .gradle ，如图：

   <img src="Codes/android/KotlinNote/docs/mooc/imgs/gradle_download_1.png" alt="image-20210617001703621" style="zoom: 50%;" />

3. 下载完成后，解压。

#### 2. 依赖下载不下来

就是 Project 下的 build.gradle 中：
```groovy
repositories {
    mavenCentral()
}
```
下载不下来，那么就换个地址。用 aliyun 的，在浏览器中搜索并打开，如图：

<img src="/Users/kk/Codes/android/KotlinNote/docs/mooc/imgs/gradle_download_maven.png" alt="image-20210617084049669" style="zoom:33%;" />
然后找到一个版本，复制 path。

#### 3. Gradle Sync failed 怎么办？

- 依赖找不到：
    - build 会有错误日志
    - 或者直接打开 Terminal, 执行：`./gradlew --debug` 
plugins {
  kotlin("jvm")
  id("ru.vyarus.animalsniffer")
}

dependencies {
  api(projects.okhttp)
  api(projects.okhttpTls)
  api(libs.assertj.core)
  api(libs.bouncycastle.bcprov)
  implementation(libs.bouncycastle.bcpkix)
  implementation(libs.bouncycastle.bctls)
  api(libs.conscrypt.openjdk)
  api(libs.amazon.corretto)
  api(libs.openjsse)
  api(libs.hamcrest.library)
  api(libs.junit.jupiter.api)
  api(libs.junit.jupiter.params)

  compileOnly(libs.findbugs.jsr305)
  compileOnly(libs.robolectric.android)
}

animalsniffer {
  isIgnoreFailures = true
}

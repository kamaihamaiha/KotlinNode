package cn.kk.mooc.chapter4.section5

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path


// 定义 Retrofit 访问接口

interface GitHubApi {

    @GET("repos/{owner}/{repo}")
    fun getRepository(@Path("owner") owner: String,@Path("repo") repo: String): Call<Repository>
}

fun main(){

    val gitHubApi = Retrofit.Builder()
        .baseUrl("https://api.github.com")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(GitHubApi::class.java)

    val response = gitHubApi.getRepository("JetBrains","Kotlin").execute()

    if (response.isSuccessful) {
       val repository = response.body()

        if (repository == null){
            println("Error! ${response.code()} - ${response.message()}")
            return
        }

        println(repository.name)
        println(repository.owner.html_url)
        println(repository.stargazers_count)
    }


}
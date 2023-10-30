package com.aiselp.autojs.codeeditor.web

import android.content.Context
import android.util.Log
import fi.iki.elonen.SimpleWebServer
import java.io.File

class FileHttpServer(context: Context,path:File) :
    SimpleWebServer("127.0.0.1", SPort, path, false) {
    companion object {
        var SPort = 42201
    }
    val port = SPort
    init {
        SPort++
        Log.d("FileHttpServer", "FileHttpServer init host: ${this.hostname} port: $port")
    }
}
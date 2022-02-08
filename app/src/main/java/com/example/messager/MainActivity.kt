package com.example.messager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.messager.model.Message
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.messager.adapter.ChatAdapter
import com.example.messager.model.Chat
import com.example.messager.model.Room

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }
    fun initView(){
        recyclerView = findViewById<RecyclerView>(R.id.recycle_view)
        recyclerView.setLayoutManager(GridLayoutManager(this,1))
        refreshAdapter(getAllCjhats())
    }

    fun refreshAdapter(chats:ArrayList<Chat>) {
        val adapter = ChatAdapter(this,chats)
        recyclerView!!.adapter = adapter
    }

    fun getAllCjhats():ArrayList<Chat> {
        val stories: ArrayList<Room> = ArrayList<Room>()
        stories.add(Room(R.drawable.p_sherzod,"Sherzod Jurabekov"))
        stories.add(Room(R.drawable.p_sherzod,"Sherzod Jurabekov"))
        stories.add(Room(R.drawable.p_sherzod,"Sherzod Jurabekov"))
        stories.add(Room(R.drawable.p_sherzod,"Sherzod Jurabekov"))
        stories.add(Room(R.drawable.p_sherzod,"Sherzod Jurabekov"))
        stories.add(Room(R.drawable.p_sherzod,"Sherzod Jurabekov"))
        stories.add(Room(R.drawable.p_sherzod,"Sherzod Jurabekov"))
        stories.add(Room(R.drawable.p_sherzod,"Sherzod Jurabekov"))
        stories.add(Room(R.drawable.p_sherzod,"Sherzod Jurabekov"))
        stories.add(Room(R.drawable.p_sherzod,"Sherzod Jurabekov"))
        stories.add(Room(R.drawable.p_sherzod,"Sherzod Jurabekov"))


        val chats:ArrayList<Chat> = ArrayList<Chat>()
        chats.add(Chat(stories))
        chats.add(Chat(Message(R.drawable.p_sherzod,"Sherzod Jurabekov",true)))
        chats.add(Chat(Message(R.drawable.p_sherzod,"Sherzod Jurabekov",true)))
        chats.add(Chat(Message(R.drawable.p_sherzod,"Sherzod Jurabekov",false)))
        chats.add(Chat(Message(R.drawable.p_sherzod,"Sherzod Jurabekov",true)))
        chats.add(Chat(Message(R.drawable.p_sherzod,"Sherzod Jurabekov",false)))
        chats.add(Chat(Message(R.drawable.p_sherzod,"Sherzod Jurabekov",true)))
        chats.add(Chat(Message(R.drawable.p_sherzod,"Sherzod Jurabekov",true)))
        chats.add(Chat(Message(R.drawable.p_sherzod,"Sherzod Jurabekov",false)))
        chats.add(Chat(Message(R.drawable.p_sherzod,"Sherzod Jurabekov",true)))
        chats.add(Chat(Message(R.drawable.p_sherzod,"Sherzod Jurabekov",true)))
        chats.add(Chat(Message(R.drawable.p_sherzod,"Sherzod Jurabekov",false)))
        return chats
    }
}
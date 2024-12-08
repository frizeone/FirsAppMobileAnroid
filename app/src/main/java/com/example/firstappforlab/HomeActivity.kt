//package com.example.firstappforlab
//
//import android.annotation.SuppressLint
//import android.os.Bundle
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.TextView
//import androidx.appcompat.app.AppCompatActivity
//import androidx.recyclerview.widget.LinearLayoutManager
//import androidx.recyclerview.widget.RecyclerView
//
//class HomeActivity : AppCompatActivity() {
//
//    @SuppressLint("MissingInflatedId")
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_home)
//
//        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
//        recyclerView.layoutManager = LinearLayoutManager(this)
//
//        val chats = listOf(
//            Chat("Alice", "Hello!", "12:00"),
//            Chat("Bob", "How are you?", "11:30"),
//            Chat("Charlie", "See you soon", "10:45")
//        )
//
//        val adapter = ChatAdapter(chats)
//        recyclerView.adapter = adapter
//    }
//}
//
//class ChatAdapter(private val chats: List<Chat>) : RecyclerView.Adapter<ChatAdapter.ChatViewHolder>() {
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
//        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_chat, parent, false)
//        return ChatViewHolder(view)
//    }
//
//    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
//        val chat = chats[position]
//        holder.bind(chat)
//    }
//
//    override fun getItemCount(): Int = chats.size
//
//    class ChatViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        fun bind(chat: Chat) {
//            itemView.findViewById<TextView>(R.id.userName).text = chat.userName
//            itemView.findViewById<TextView>(R.id.lastMessage).text = chat.lastMessage
//            itemView.findViewById<TextView>(R.id.messageTime).text = chat.time
//        }
//    }
//}

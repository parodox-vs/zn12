package dao

import com.example.praktikakapustnikov.dto.Post

interface PostDao {
    fun getAll(): List<Post>
    fun save(post: Post): Post
    fun likeById(id: Long)
    fun removeById(id: Long)
    fun Post(
        id: Long,
        author: String?,
        content: String?,
        published: String?,
        likedByMe: Boolean,
        likes: Int
    ): Post
}
import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.doglist.Data
import com.example.doglist.R

class DogAdapter(private val dogs: List<Data.Dog>) : RecyclerView.Adapter<DogAdapter.DogViewHolder>() {

    inner class DogViewHolder(val view: android.view.View) : RecyclerView.ViewHolder(view) {
        val breedTextView: TextView = view.findViewById(R.id.breedTextView)
        val descriptionTextView: TextView = view.findViewById(R.id.descriptionTextView)
        val imageView: ImageView = view.findViewById(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_dog_image, parent, false)
        return DogViewHolder(view)
    }

    @SuppressLint("CheckResult")
    override fun onBindViewHolder(holder: DogViewHolder, position: Int) {
        val dog = dogs[position]
        holder.breedTextView.text = dog.photoUrl
        holder.descriptionTextView.text = dog.description
        Glide.with(holder.itemView.context)
            .load(dog.photoUrl)
            .placeholder(R.drawable.ic_launcher_background).into(holder.imageView)
    }

    override fun getItemCount(): Int {
        return dogs.size
    }
}
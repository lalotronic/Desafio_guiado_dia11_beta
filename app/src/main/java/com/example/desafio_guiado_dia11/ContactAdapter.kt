package com.example.desafio_guiado_dia11

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.desafio_guiado_dia11.databinding.ItemContactBinding


/*class ContactAdapter() : RecyclerView.Adapter<>() {
    inner class ContactViewHolder(private val binding: ItemContactBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(contact: Contact) {

            }
        }
}
*/
class ContactAdapter(
    private val contacts: List<Contact>
) : RecyclerView.Adapter<ContactAdapter.ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            ContactViewHolder {
        val binding = ItemContactBinding.inflate(LayoutInflater.from(parent.context), parent,
                false)
        return ContactViewHolder(binding)
    }
    override fun onBindViewHolder(holder: ContactViewHolder, position:
    Int) {
        holder.onBind(contacts[position])
    }
    override fun getItemCount(): Int = contacts.size
    inner class ContactViewHolder(private val binding: ItemContactBinding) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(contact: Contact) {
            with(binding) {
                contact.run {
                    tvContactName.text = name
                    tvContactPhoneNumber.text = phoneNumber
                }
            }
        }
    }

}

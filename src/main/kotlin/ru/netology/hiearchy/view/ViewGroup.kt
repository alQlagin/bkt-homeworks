package ru.netology.hiearchy.view

class ViewGroup : View() {
    public lateinit var view: View;
    fun addView(view: View) {
        this.view = view;
    }

    fun getView(): Boolean {
        return this::view.isInitialized;
    }
}
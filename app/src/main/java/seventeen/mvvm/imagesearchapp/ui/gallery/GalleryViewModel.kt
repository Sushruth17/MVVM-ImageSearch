package seventeen.mvvm.imagesearchapp.ui.gallery

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.*
import androidx.paging.cachedIn
import seventeen.mvvm.imagesearchapp.data.UnsplashRepository

class GalleryViewModel @ViewModelInject constructor(
    private val repository: UnsplashRepository
) : ViewModel() {

    private val currentQuery = MutableLiveData(DEFAULT_QUERY)

    val photos = currentQuery.switchMap { queryString ->
        repository.getSearchResults(queryString).cachedIn(viewModelScope)
    }

    fun searchPhotos(query: String) {
        currentQuery.value = query
    }

    companion object {
        private const val DEFAULT_QUERY = "cats"
    }
}

package io.prashant.starwars.ui.characters

import androidx.lifecycle.ViewModel
import androidx.paging.PagingData
import dagger.hilt.android.lifecycle.HiltViewModel
import io.prashant.starwars.data.local.Character
import io.prashant.starwars.data.repository.CharacterRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@HiltViewModel
class CharactersViewModel @Inject constructor(
    private val characterRepository: CharacterRepository
) : ViewModel() {

    fun getCharacters(): Flow<PagingData<Character>> =
        characterRepository.getCharacters()

}
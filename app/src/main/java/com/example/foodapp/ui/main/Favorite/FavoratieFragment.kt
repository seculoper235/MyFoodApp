package com.example.foodapp.ui.main.Favorite

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.foodapp.R
import com.example.foodapp.ui.main.PageViewModel

class FavoratieFragment : Fragment() {
    // 부모 액티비티와 ViewModel 공유
    //private lateinit var myViewModel: PageViewModel
    private lateinit var pageViewModel: PageViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //myViewModel.setIndex(2)
        pageViewModel = ViewModelProvider(this).get(PageViewModel::class.java).apply {
            setIndex(2)
            //setIndex(arguments?.getInt(ARG_SECTION_NUMBER) ?: 1)
        }
        //myViewModel = ViewModelProvider(this, ViewFactory()).get(PageViewModel::class.java)
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var chat = inflater.inflate(R.layout.fragment_favorite, container, false)
        // fragment_chat.xml 내부에 구성한 View들을 가져옴
        var text:EditText = chat.findViewById(R.id.editTextTextMultiLine)
        // pageViewModel로 View들을 채움

        // Observer 객체 작성하기
        // LiveData가 들고있는 데이터(text)가 변경되었을 때, 수행할 메소드를 작성한다(onChanged())
        // 여기서는 프래그먼트의 text 값을 바꿔준다
        /*val textObserver = Observer<String> {
            newText -> text.setText(newText)
        }*/

        // ktx를 사용하면 알아서 lifecycleOwner를 설정해준다
        // observe() 메소드 작성하기
        // LiveData를 관찰하여 데이터에 변화가 일어나면, 해당 viewLifecycleOwner에 Observer 메소드를 적용한다
        //myViewModel.text.observe(viewLifecycleOwner, textObserver)

        return chat
    }
}
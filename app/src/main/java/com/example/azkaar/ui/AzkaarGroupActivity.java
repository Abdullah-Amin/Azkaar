package com.example.azkaar.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.azkaar.R;
import com.example.azkaar.adapters.AzkaarGroupAdapter;
import com.example.azkaar.callbacks.HomeI;
import com.example.azkaar.constants.AzkaarConst;
import com.example.azkaar.data.HomeItemModel;
import com.example.azkaar.databinding.ActivityAzkaarGroupBinding;

import java.util.ArrayList;

public class AzkaarGroupActivity extends AppCompatActivity {

    private ActivityAzkaarGroupBinding binding;
    ArrayList<String> azkaarGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAzkaarGroupBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        azkaarGroup = new ArrayList<>();

        String text = getIntent().getStringExtra(AzkaarConst.HOME_ITEM_TEXT);

        switch (text) {
            case "النهار والليلة":
                binding.imageView.setImageResource(R.drawable.moon1);
                azkaarGroup.add("أذكار الصباح والمساء");
                azkaarGroup.add("أذكار الاستيقاظ من النوم");
                azkaarGroup.add("أذكار النوم");
                azkaarGroup.add("مايفعل من رؤية الفزع أو الحلم");
                azkaarGroup.add("الدعاء اذا تقلب ليلا");
                break;
            case "الوضوء والصلاة":
                binding.imageView.setImageResource(R.drawable.sala1);
                azkaarGroup.add("مايقال قبل الوضوء");
                azkaarGroup.add("مايقال بعد الوضوء");
                azkaarGroup.add("دعاء الذهاب الي بيت الله");
                azkaarGroup.add("دعاء الدخول إلي بيت الله");
                azkaarGroup.add("دعاء الخروج من بيت الله");
                azkaarGroup.add("مايقال أثناء الأذان");
                azkaarGroup.add("دعاء الاستفتاح");
                azkaarGroup.add("دعاء الركوع");
                azkaarGroup.add("دعاء الرفع من الركوع");
                azkaarGroup.add("دعاء السجود");
                azkaarGroup.add("دعاء الجلسة بين السجدتين");
                azkaarGroup.add("دعاء سجدة التلاوة");
                azkaarGroup.add("التشهد");
                azkaarGroup.add("الدعاء بعد التشهد وماقبل السلام");
                azkaarGroup.add("الصلاة علي النبي بعد التشهد");
                azkaarGroup.add("الأذكار بعد السلام من الصلاة");
                azkaarGroup.add("دعاء قنوت الوتر");
                azkaarGroup.add("الذكر عقب السلام من الوتر");
                azkaarGroup.add("دعاء الوسوسة في الصلاة والقراءة");
                break;
            case "الأكل والشراب":
                binding.imageView.setImageResource(R.drawable.food1);
                azkaarGroup.add("الدعاء عند إفطار الصائم");
                azkaarGroup.add("الدعاء قبل الطعام");
                azkaarGroup.add("الدعاء عند الفراغ من الطعام");
                azkaarGroup.add("دعاء الضيف لصاحب البيت");
                azkaarGroup.add("التعريض بالدعاء لطلب الطعام والمشرب");
                azkaarGroup.add("الدعاء اذا أفطر عند أهل البيت");
                azkaarGroup.add("دعاء الصائم إذا حضر الطعام ولم يفطر");
                break;
            case "الحج والعمرة":
                binding.imageView.setImageResource(R.drawable.hag1);
                azkaarGroup.add("كيف يلبي المحرم في الحج أوالعمرة");
                azkaarGroup.add("التكبير إذا أتي الحجر الأسود");
                azkaarGroup.add("الدعاء بين الركن اليماني والحجر الأسود");
                azkaarGroup.add("دعاء الوقوف علي الصفا والمروة");
                azkaarGroup.add("الدعاء يوم عرفة");
                azkaarGroup.add("الذكر عند المشعر الحرام");
                azkaarGroup.add("التكبير عند رمي الجمار مع كل حصاة");
                azkaarGroup.add("مايقول عند الذبح أوالنحر");
                break;
            case "الخوف والسعادة":
                binding.imageView.setImageResource(R.drawable.smile1);
                azkaarGroup.add("دعاء قضاء الدين");
                azkaarGroup.add("دعاء من أصيب بمصيبة");
                azkaarGroup.add("دعاء من أصابه وسوسة في الإيمان");
                azkaarGroup.add("دعاء الخوف من الشرك");
                azkaarGroup.add("دعاء كراهية الطيرة");
                azkaarGroup.add("مايقال عند الفزع");
                azkaarGroup.add("مايقال من أتاه أمر يسره");
                azkaarGroup.add("مايقال عند التعجب والأمر السار");
                azkaarGroup.add("مايقال من أتاه أمر يسره أو يكرهه");
                azkaarGroup.add("مايقول من خاف قوما");
                azkaarGroup.add("الدعاء علي العدو");
                azkaarGroup.add("دعاء من خاف ظلم السلطان");
                azkaarGroup.add("دعاء لقاء العدو وذي السلطان");
                azkaarGroup.add("دعاء الكرب");
                azkaarGroup.add("دعاء الهم والحزن");
                break;
            case "المرض والمصائب":
                binding.imageView.setImageResource(R.drawable.patient);
                azkaarGroup.add("ما يفعل ويقول من أحس ألما في جسده");
                azkaarGroup.add("دعاء زيارة القبور");
                azkaarGroup.add("مايعوذ به الأولاد");
                azkaarGroup.add("الدعاء للمريض في عيادته");
                azkaarGroup.add("فضل زيارة المريض");
                azkaarGroup.add("دعاء المريض الذي يئس من حياته");
                azkaarGroup.add("تلقين المحتضر");
                azkaarGroup.add("الدعاء عن إغماض الميت");
                azkaarGroup.add("الدعاء للميت أثناء الصلاة عليه");
                azkaarGroup.add("الدعاء للفرط في الصلاة عليه");
                azkaarGroup.add("دعاء التعزية");
                azkaarGroup.add("الدعاء عند إدخال الميت للقبر");
                azkaarGroup.add("الدعاء بعد دفن الميت");
                break;
            case "الأدب والتعامل":
                binding.imageView.setImageResource(R.drawable.deal1);
                azkaarGroup.add("ما يقول المسلم إذا زكي");
                azkaarGroup.add("ما يقول المسلم إذا مدح المسلم");
                azkaarGroup.add("الدعاء لمن سببته");
                azkaarGroup.add("إفشاء السلام");
                azkaarGroup.add("كيف يرد السلام علي الكافر إذا سلم");
                azkaarGroup.add("الدعاء لمن قال بارك الله فيك");
                azkaarGroup.add("الدعاء لمن أقرض عند القضاء");
                azkaarGroup.add("الدعاء لمن عرض عليك ماله");
                azkaarGroup.add("الدعاء لمن قال إني أحبك في الله");
                azkaarGroup.add("تهنئة المولود له وجوابه");
                azkaarGroup.add("مايقول الصائم إذا سابه أحد");
                azkaarGroup.add("دعاء العطاس");
                azkaarGroup.add("ما يقال للكافر إذا عطس فحمد الله");
                azkaarGroup.add("دعاء المتزوج وشراء الدابة");
                azkaarGroup.add("دعاء الغضب");
                azkaarGroup.add("دعاء من رأي مبتلي");
                azkaarGroup.add("ما يقال في المجلس");
                azkaarGroup.add("كفارة المجلس");
                azkaarGroup.add("الدعاء لمن قال غفر الله لك");
                azkaarGroup.add("الدعاء لمن صنع إليك معروفا");
                break;
            case "السفر والتوكل":
                binding.imageView.setImageResource(R.drawable.travel1);
                azkaarGroup.add("دعاء الركوب");
                azkaarGroup.add("دعاء السفر");
                azkaarGroup.add("دعاء دخول القرية أوالبلدة");
                azkaarGroup.add("دعاء دخول السوق");
                azkaarGroup.add("الدعاء إذا تعس المركوب");
                azkaarGroup.add("دعاء المسافر للمقيم");
                azkaarGroup.add("دعاء المقيم للمسافر");
                azkaarGroup.add("التكبير والتسبيح في سير السفر");
                azkaarGroup.add("دعاء المسافر إذا أسحر");
                azkaarGroup.add("الدعاء إذا نزل منزلا في سفر أوغيره");
                azkaarGroup.add("ذكر الرجوع من السفر");
                break;
            case "السحر والحسد":
                binding.imageView.setImageResource(R.drawable.ain2);
                azkaarGroup.add("ورد الرقية الشرعية");
                azkaarGroup.add("تحصين الأطفال عند الخروج");
                azkaarGroup.add("تحصين الأطفال عند النوم");
                azkaarGroup.add("فك السحر والعين");
                break;
            default:
                binding.imageView.setImageResource(R.drawable.study1);
                azkaarGroup.add("الإعانة علي طلب العلم وقوة الحفظ");
                azkaarGroup.add("دعاء قبل الإمتحان");
                azkaarGroup.add("عند التوجه للإمتحان");
                azkaarGroup.add("عند دخول قاعة الإمتحان");
                azkaarGroup.add("أثناء الإمتحان");
                azkaarGroup.add("عند تعسر الإمتحان");
                azkaarGroup.add("عند نهاية الإجابة");
                break;
        }

        binding.recyclerView.setAdapter(new AzkaarGroupAdapter(azkaarGroup, new HomeI() {
            @Override
            public void getItemText(String itemText) {
                Intent intent = new Intent(AzkaarGroupActivity.this, AzkaarDetailsActivity.class);
                intent.putExtra(AzkaarConst.AZKAAR_ITEM_TEXT, itemText);
                startActivity(intent);
            }
        }));
    }
}
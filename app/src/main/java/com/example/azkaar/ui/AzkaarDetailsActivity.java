package com.example.azkaar.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.azkaar.R;
import com.example.azkaar.constants.AzkaarConst;
import com.example.azkaar.databinding.ActivityAzkaarDetailsBinding;

public class AzkaarDetailsActivity extends AppCompatActivity {

    ActivityAzkaarDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAzkaarDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String text = getIntent().getStringExtra(AzkaarConst.AZKAAR_ITEM_TEXT);

        switch (text) {
            case "أذكار الصباح والمساء":
                binding.textViewAzkaar.setText(R.string.Sabah1_Text);
                binding.textNote.setText(R.string.Sabah1_Hint);
                break;
            case "أذكار الاستيقاظ من النوم":
                binding.textViewAzkaar.setText(R.string.noom1_Text);
                binding.textNote.setText(R.string.noom1_Hint);
                break;

            case "أذكار النوم":
                binding.textViewAzkaar.setText(R.string.sleep1_Text);
                binding.textNote.setText(R.string.sleep1_Hint);
                break;
            case "مايفعل من رؤية الفزع أو الحلم":
                binding.textViewAzkaar.setText(R.string.fazah_Text);
                binding.textNote.setText(R.string.fazah_Hint);
                break;
            case "الدعاء اذا تقلب ليلا":
                binding.textViewAzkaar.setText(R.string.Takalap_Text);
                binding.textNote.setText(R.string.Takalap_Hint);
                break;
            case "مايقال قبل الوضوء":
                binding.textViewAzkaar.setText(R.string.beforesala_Text);
                binding.textNote.setText(R.string.beforesala_Hint);
                break;
            case "مايقال بعد الوضوء":
                binding.textViewAzkaar.setText(R.string.aftersala1_Text);
                binding.textNote.setText(R.string.aftersala1_Hint);
                break;
            case "دعاء الذهاب الي بيت الله":
                binding.textViewAzkaar.setText(R.string.gomasged_Text);
                binding.textNote.setText(R.string.gomasged_Hint);
                break;
            case "دعاء الدخول إلي بيت الله":
                binding.textViewAzkaar.setText(R.string.dokolmasged_Text);
                binding.textNote.setText(R.string.dokolmasged_Hint);
                break;
            case "دعاء الخروج من بيت الله":
                binding.textViewAzkaar.setText(R.string.korogmasged_Text);
                binding.textNote.setText(R.string.korogmasged_Hint);
                break;
            case "مايقال أثناء الأذان":
                binding.textViewAzkaar.setText(R.string.azan_Text);
                binding.textNote.setText(R.string.azan_Hint);
                break;
            case "دعاء الاستفتاح":
                binding.textViewAzkaar.setText(R.string.start_Text);
                binding.textNote.setText(R.string.start_Hint);
                break;
            case "دعاء الركوع":
                binding.textViewAzkaar.setText(R.string.rokoa_Text);
                binding.textNote.setText(R.string.rokoa_Hint);
                break;
            case "دعاء الرفع من الركوع":
                binding.textViewAzkaar.setText(R.string.rafarokoa_Text);
                binding.textNote.setText(R.string.rafarokoa_Hint);
                break;
            case "دعاء السجود":
                binding.textViewAzkaar.setText(R.string.sogod_Text);
                binding.textNote.setText(R.string.sogod_Hint);
                break;
            case "دعاء الجلسة بين السجدتين":
                binding.textViewAzkaar.setText(R.string.galsa_Text);
                binding.textNote.setText(R.string.galsa_Hint);
                break;
            case "دعاء سجدة التلاوة":
                binding.textViewAzkaar.setText(R.string.sagdatelawa_Text);
                binding.textNote.setText(R.string.sagdatelawa_Hint);
                break;
            case "التشهد":
                binding.textViewAzkaar.setText(R.string.tashahod_Text);
                binding.textNote.setText(R.string.tashahod_Hint);
                break;
            case "الدعاء بعد التشهد وماقبل السلام":
                binding.textViewAzkaar.setText(R.string.BA_Text);
                binding.textNote.setText(R.string.BA_Hint);
                break;
            case "الصلاة علي النبي بعد التشهد":
                binding.textViewAzkaar.setText(R.string.naby_Text);
                binding.textNote.setText(R.string.naby_Hint);
                break;
            case "الأذكار بعد السلام من الصلاة":
                binding.textViewAzkaar.setText(R.string.AfterSalam_Text);
                binding.textNote.setText(R.string.AfterSalam_Hint);
                break;
            case "دعاء قنوت الوتر":
                binding.textViewAzkaar.setText(R.string.Konot_Text);
                binding.textNote.setText(R.string.Konot_Hint);
                break;
            case "الذكر عقب السلام من الوتر":
                binding.textViewAzkaar.setText(R.string.AfterWetr_Text);
                binding.textNote.setText(R.string.AfterWetr_Hint);
                break;
            case "دعاء الوسوسة في الصلاة والقراءة":
                binding.textViewAzkaar.setText(R.string.Waswasa_Text);
                binding.textNote.setText(R.string.Waswasa_Hint);
                break;
            case "الدعاء عند إفطار الصائم":
                binding.textViewAzkaar.setText(R.string.end1_3_Text);
                binding.textNote.setText(R.string.end1_3_Hint);
                break;
            case "الدعاء قبل الطعام":
                binding.textViewAzkaar.setText(R.string.kabl2_3_Text);
                binding.textNote.setText(R.string.kab12_3_Hint);
                break;
            case "الدعاء عند الفراغ من الطعام":
                binding.textViewAzkaar.setText(R.string.bad3_3_Text);
                binding.textNote.setText(R.string.bad3_3_Hint);
                break;
            case "دعاء الضيف لصاحب البيت":
                binding.textViewAzkaar.setText(R.string.lesaheb4_3_Text);
                binding.textNote.setText(R.string.lesaheb4_3_Hint);
                break;
            case "التعريض بالدعاء لطلب الطعام والمشرب":
                binding.textViewAzkaar.setText(R.string.tareed5_3_Text);
                binding.textNote.setText(R.string.tareed5_3_Hint);
                break;
            case "الدعاء اذا أفطر عند أهل البيت":
                binding.textViewAzkaar.setText(R.string.endahl6_3_Text);
                binding.textNote.setText(R.string.endahl6_3_Hint);
                break;
            case "دعاء الصائم إذا حضر الطعام ولم يفطر":
                binding.textViewAzkaar.setText(R.string.lamyaftor7_3_Text);
                binding.textNote.setText(R.string.lamyaftor7_3_Hint);
                break;
            case "كيف يلبي المحرم في الحج أوالعمرة":
                binding.textViewAzkaar.setText(R.string.kayf1_4_Text);
                binding.textNote.setText(R.string.kayf1_4_Hint);
                break;
            case "التكبير إذا أتي الحجر الأسود":
                binding.textViewAzkaar.setText(R.string.takbeer2_4_Text);
                binding.textNote.setText(R.string.takbeer2_4_Hint);
                break;
            case "الدعاء بين الركن اليماني والحجر الأسود":
                binding.textViewAzkaar.setText(R.string.rokn3_4_Text);
                binding.textNote.setText(R.string.rokn3_4_Hint);
                break;
            case "دعاء الوقوف علي الصفا والمروة":
                binding.textViewAzkaar.setText(R.string.wakoof4_4_Text);
                binding.textNote.setText(R.string.wakoof4_4_Hint);
                break;
            case "الدعاء يوم عرفة":
                binding.textViewAzkaar.setText(R.string.arafa5_4_Text);
                binding.textNote.setText(R.string.arafa5_4_Hint);
                break;
            case "الذكر عند المشعر الحرام":
                binding.textViewAzkaar.setText(R.string.mashar6_4_Text);
                binding.textNote.setText(R.string.mashar6_4_Hint);
                break;
            case "التكبير عند رمي الجمار مع كل حصاة":
                binding.textViewAzkaar.setText(R.string.ramy7_4_Text);
                binding.textNote.setText(R.string.ramy7_4_Hint);
                break;
            case "مايقول عند الذبح أوالنحر":
                binding.textViewAzkaar.setText(R.string.zabh8_4_Text);
                binding.textNote.setText(R.string.zabh8_4_Hint);
                break;
            case "دعاء قضاء الدين":
                binding.textViewAzkaar.setText(R.string.kada1_5_Text);
                binding.textNote.setText(R.string.kada1_5_Hint);
                break;
            case "دعاء من أصيب بمصيبة":
                binding.textViewAzkaar.setText(R.string.mosyba2_5_Text);
                binding.textNote.setText(R.string.mosyba2_5_Hint);
                break;
            case "دعاء من أصابه وسوسة في الإيمان":
                binding.textViewAzkaar.setText(R.string.wes3_5_Text);
                binding.textNote.setText(R.string.wes3_5_Hint);
                break;
            case "دعاء الخوف من الشرك":
                binding.textViewAzkaar.setText(R.string.sherk4_5_Text);
                binding.textNote.setText(R.string.sherk4_5_Hint);
                break;
            case "دعاء كراهية الطيرة":
                binding.textViewAzkaar.setText(R.string.tyar5_5_Text);
                binding.textNote.setText(R.string.tyar5_5_Hint);
                break;
            case "مايقال عند الفزع":
                binding.textViewAzkaar.setText(R.string.endfazah6_5_Text);
                binding.textNote.setText(R.string.endfazah6_5_Hint);
                break;
            case "مايقال من أتاه أمر يسره":
                binding.textViewAzkaar.setText(R.string.yosr7_5_Text);
                binding.textNote.setText(R.string.yosr7_5_Hint);
                break;
            case "مايقال عند التعجب والأمر السار":
                binding.textViewAzkaar.setText(R.string.sar8_5_Text);
                binding.textNote.setText(R.string.sar8_5_Hint);
                break;
            case "مايقال من أتاه أمر يسره أو يكرهه":
                binding.textViewAzkaar.setText(R.string.kar9_5_Text);
                binding.textNote.setText(R.string.kar9_5_Hint);
                break;
            case "مايقول من خاف قوما":
                binding.textViewAzkaar.setText(R.string.kaf10_5_Text);
                binding.textNote.setText(R.string.kaf10_5_Hint);
                break;
            case "الدعاء علي العدو":
                binding.textViewAzkaar.setText(R.string.adw11_5_Text);
                binding.textNote.setText(R.string.adw11_5_Hint);
                break;
            case "دعاء من خاف ظلم السلطان":
                binding.textViewAzkaar.setText(R.string.zolm12_5_Text);
                binding.textNote.setText(R.string.zolm12_5_Hint);
                break;
            case "دعاء لقاء العدو وذي السلطان":
                binding.textViewAzkaar.setText(R.string.soltan13_5_Text);
                binding.textNote.setText(R.string.soltan13_5_Hint);
                break;
            case "دعاء الكرب":
                binding.textViewAzkaar.setText(R.string.karb14_5_Text);
                binding.textNote.setText(R.string.karb14_5_Hint);
                break;
            case "دعاء الهم والحزن":
                binding.textViewAzkaar.setText(R.string.ham15_5_Text);
                binding.textNote.setText(R.string.ham15_5_Hint);
                break;
            case "ما يفعل ويقول من أحس ألما في جسده":
                binding.textViewAzkaar.setText(R.string.alam1_6_Text);
                binding.textNote.setText(R.string.alam1_6_Hint);
                break;
            case "دعاء زيارة القبور":
                binding.textViewAzkaar.setText(R.string.zyara2_6_Text);
                binding.textNote.setText(R.string.zyara2_6_Hint);
                break;
            case "مايعوذ به الأولاد":
                binding.textViewAzkaar.setText(R.string.yaoz3_6_Text);
                binding.textNote.setText(R.string.yaoz3_6_Hint);
                break;
            case "الدعاء للمريض في عيادته":
                binding.textViewAzkaar.setText(R.string.maryd4_6_Text);
                binding.textNote.setText(R.string.maryd4_6_Hint);
                break;
            case "فضل زيارة المريض":
                binding.textViewAzkaar.setText(R.string.zmaryd5_6_Text);
                binding.textNote.setText(R.string.zmaryd5_6_Hint);
                break;
            case "دعاء المريض الذي يئس من حياته":
                binding.textViewAzkaar.setText(R.string.yaes6_6_Text);
                binding.textNote.setText(R.string.yaes6_6_Hint);
                break;
            case "تلقين المحتضر":
                binding.textViewAzkaar.setText(R.string.talken7_6_Text);
                binding.textNote.setText(R.string.talken7_6_Hint);
                break;
            case "الدعاء عن إغماض الميت":
                binding.textViewAzkaar.setText(R.string.egmad8_6_Text);
                binding.textNote.setText(R.string.egmad8_6_Hint);
                break;
            case "الدعاء للميت أثناء الصلاة عليه":
                binding.textViewAzkaar.setText(R.string.asna9_6_Text);
                binding.textNote.setText(R.string.asna9_6_Hint);
                break;
            case "الدعاء للفرط في الصلاة عليه":
                binding.textViewAzkaar.setText(R.string.fart10_6_Text);
                binding.textNote.setText(R.string.fart10_6_Hint);
                break;
            case "دعاء التعزية":
                binding.textViewAzkaar.setText(R.string.tazya11_6_Text);
                binding.textNote.setText(R.string.tazya11_6_Hint);
                break;
            case "الدعاء عند إدخال الميت للقبر":
                binding.textViewAzkaar.setText(R.string.edkal12_6_Text);
                binding.textNote.setText(R.string.edkal12_6_Hint);
                break;
            case "الدعاء بعد دفن الميت":
                binding.textViewAzkaar.setText(R.string.dafn13_6_Text);
                binding.textNote.setText(R.string.dafn13_6_Hint);
                break;
            case "ما يقول المسلم إذا زكي":
                binding.textViewAzkaar.setText(R.string.eza1_7_Text);
                binding.textNote.setText(R.string.eza1_7_Hint);
                break;
            case "ما يقول المسلم إذا مدح المسلم":
                binding.textViewAzkaar.setText(R.string.madh2_7_Text);
                binding.textNote.setText(R.string.madh2_7_Hint);
                break;
            case "الدعاء لمن سببته":
                binding.textViewAzkaar.setText(R.string.sab3_7_Text);
                binding.textNote.setText(R.string.sab3_7_Hint);
                break;
            case "إفشاء السلام":
                binding.textViewAzkaar.setText(R.string.salam4_7_Text);
                binding.textNote.setText(R.string.salam4_7_Hint);
                break;
            case "كيف يرد السلام علي الكافر إذا سلم":
                binding.textViewAzkaar.setText(R.string.kafer5_7_Text);
                binding.textNote.setText(R.string.kafer5_7_Hint);
                break;
            case "الدعاء لمن قال بارك الله فيك":
                binding.textViewAzkaar.setText(R.string.barak6_7_Text);
                binding.textNote.setText(R.string.barak6_7_Hint);
                break;
            case "الدعاء لمن أقرض عند القضاء":
                binding.textViewAzkaar.setText(R.string.kada7_7_Text);
                binding.textNote.setText(R.string.kada7_7_Hint);
                break;
            case "الدعاء لمن عرض عليك ماله":
                binding.textViewAzkaar.setText(R.string.malah8_7_Text);
                binding.textNote.setText(R.string.malah8_7_Hint);
                break;
            case "الدعاء لمن قال إني أحبك في الله":
                binding.textViewAzkaar.setText(R.string.habak9_7_Text);
                binding.textNote.setText(R.string.habak9_7_Hint);
                break;
            case "تهنئة المولود له وجوابه":
                binding.textViewAzkaar.setText(R.string.mawlod10_7_Text);
                binding.textNote.setText(R.string.mawlod10_7_Hint);
                break;
            case "مايقول الصائم إذا سابه أحد":
                binding.textViewAzkaar.setText(R.string.sam11_7_Text);
                binding.textNote.setText(R.string.sam11_7_Hint);
                break;
            case "دعاء العطاس":
                binding.textViewAzkaar.setText(R.string.ats12_7_Text);
                binding.textNote.setText(R.string.ats12_7_Hint);
                break;
            case "ما يقال للكافر إذا عطس فحمد الله":
                binding.textViewAzkaar.setText(R.string.kafer19_7_Text);
                binding.textNote.setText(R.string.kafer5_7_Hint);
                break;

            case "دعاء المتزوج وشراء الدابة":
                binding.textViewAzkaar.setText(R.string.motzaweg14_7_Text);
                binding.textNote.setText(R.string.motzaweg14_7_Hint);
                break;
            case "دعاء الغضب":
                binding.textViewAzkaar.setText(R.string.kadab15_7_Text);
                binding.textNote.setText(R.string.kadab15_7_Hint);
                break;
            case "دعاء من رأي مبتلي":
                binding.textViewAzkaar.setText(R.string.mobtala16_7_Text);
                binding.textNote.setText(R.string.mobtala16_7_Hint);
                break;
            case "ما يقال في المجلس":
                binding.textViewAzkaar.setText(R.string.magles17_7_Text);
                binding.textNote.setText(R.string.magles17_7_Hint);
                break;
            case "كفارة المجلس":
                binding.textViewAzkaar.setText(R.string.kfara18_7_Text);
                binding.textNote.setText(R.string.kfara18_7_Hint);
                break;
            case "الدعاء لمن قال غفر الله لك":
                binding.textViewAzkaar.setText(R.string.gafara19_7_Text);
                binding.textNote.setText(R.string.gafara19_7_Hint);
                break;
            case "الدعاء لمن صنع إليك معروفا":
                binding.textViewAzkaar.setText(R.string.sana20_7_Text);
                binding.textNote.setText(R.string.sana20_7_Hint);
                break;
            case "دعاء الركوب":
                binding.textViewAzkaar.setText(R.string.rakb1_8_Text);
                binding.textNote.setText(R.string.rakb1_8_Hint);
                break;
            case "دعاء السفر":
                binding.textViewAzkaar.setText(R.string.saf2_8_Text);
                binding.textNote.setText(R.string.saf2_8_Hint);
                break;
            case "دعاء دخول القرية أوالبلدة":
                binding.textViewAzkaar.setText(R.string.bald3_8_Text);
                binding.textNote.setText(R.string.bald3_8_Hint);
                break;
            case "دعاء دخول السوق":
                binding.textViewAzkaar.setText(R.string.souq4_8_Text);
                binding.textNote.setText(R.string.souq4_8_Hint);
                break;
            case "الدعاء إذا تعس المركوب":
                binding.textViewAzkaar.setText(R.string.mark5_8_Text);
                binding.textNote.setText(R.string.mark5_8_Hint);
                break;
            case "دعاء المسافر للمقيم":
                binding.textViewAzkaar.setText(R.string.mosafer6_8_Text);
                binding.textNote.setText(R.string.mosafer6_8_Hint);
                break;
            case "دعاء المقيم للمسافر":
                binding.textViewAzkaar.setText(R.string.moq7_8_Text);
                binding.textNote.setText(R.string.moq7_8_Hint);
                break;
            case "التكبير والتسبيح في سير السفر":
                binding.textViewAzkaar.setText(R.string.tak8_8_Text);
                binding.textNote.setText(R.string.tak8_8_Hint);
                break;
            case "دعاء المسافر إذا أسحر":
                binding.textViewAzkaar.setText(R.string.mos9_8_Text);
                binding.textNote.setText(R.string.mos9_8_Hint);
                break;
            case "الدعاء إذا نزل منزلا في سفر أوغيره":
                binding.textViewAzkaar.setText(R.string.nazl10_8_Text);
                binding.textNote.setText(R.string.nazl10_8_Hint);
                break;
            case "ذكر الرجوع من السفر":
                binding.textViewAzkaar.setText(R.string.raga11_8_Text);
                binding.textNote.setText(R.string.rakb1_8_Hint);
                break;
            case "ورد الرقية الشرعية":
                binding.textViewAzkaar.setText(R.string.werd1_9_Text);
                binding.textNote.setText(R.string.werd1_9_Text);
                break;
            case "تحصين الأطفال عند الخروج":
                binding.textViewAzkaar.setText(R.string.werd2_9_Text);
                binding.textNote.setText(R.string.werd2_9_Hint);
                break;
            case "تحصين الأطفال عند النوم":
                binding.textViewAzkaar.setText(R.string.werd3_9_Text);
                binding.textNote.setText(R.string.werd3_9_Hint);
                break;
            case "فك السحر والعين":
                binding.textViewAzkaar.setText(R.string.werd4_9_Text);
                binding.textNote.setText(R.string.werd4_9_Hint);
                break;
            case "الإعانة علي طلب العلم وقوة الحفظ":
                binding.textViewAzkaar.setText(R.string.study1_10_Text);
                binding.textNote.setText(R.string.study1_10_Hint);
                break;
            case "دعاء قبل الإمتحان":
                binding.textViewAzkaar.setText(R.string.study2_10_Text);
                binding.textNote.setText(R.string.study2_10_Hint);
                break;
            case "عند التوجه للإمتحان":
                binding.textViewAzkaar.setText(R.string.study3_10_Text);
                binding.textNote.setText(R.string.study3_10_Hint);
                break;
            case "عند دخول قاعة الإمتحان":
                binding.textViewAzkaar.setText(R.string.study5_10_Text);
                binding.textNote.setText(R.string.study5_10_Hint);
                break;
            case "أثناء الإمتحان":
                binding.textViewAzkaar.setText(R.string.study6_10_Text);
                binding.textNote.setText(R.string.study6_10_Hint);
                break;
            case "عند تعسر الإمتحان":
                binding.textViewAzkaar.setText(R.string.study7_Text);
                binding.textNote.setText(R.string.study7_Hint);
                break;
            default:
                binding.textViewAzkaar.setText(R.string.study8_Text);
                binding.textNote.setText(R.string.study8_Hint);
                break;
        }
    }
}
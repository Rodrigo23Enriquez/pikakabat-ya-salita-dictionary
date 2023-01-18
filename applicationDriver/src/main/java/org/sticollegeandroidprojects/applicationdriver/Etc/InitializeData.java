package org.sticollegeandroidprojects.applicationdriver.Etc;

import org.sticollegeandroidprojects.applicationdriver.database.Entity.EDictionaryWords;
import org.sticollegeandroidprojects.applicationdriver.database.Entity.ETrivia;

import java.util.ArrayList;
import java.util.List;

public class InitializeData {
    private final List<EDictionaryWords> poList = new ArrayList<>();

    private EDictionaryWords loDetail;
    private ETrivia loTrivia;

    public void InitializeWords(){
        //English to Pangasinan
        loDetail = new EDictionaryWords();
        loDetail.setWordName("I");
        loDetail.setPrnction("I");
        loDetail.setWordType("Pronoun");
        loDetail.setDescript("Used by a speaker to refer to himself or herself as the object of a verb or preposition. ");
        loDetail.setTransLte("Siak , Ak");
        loDetail.setInfoxxxx("I was the one who cooked., Siak so nanluto.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("You ");
        loDetail.setPrnction("You");
        loDetail.setWordType("Pronoun");
        loDetail.setDescript("The one or ones being addressed");
        loDetail.setTransLte("Sika, Sikayo");
        loDetail.setInfoxxxx("You are the one i love., Sika so inarok.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Yes");
        loDetail.setPrnction("Yes");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An affirmative answer or decision - especially in voting.");
        loDetail.setTransLte("On");
        loDetail.setInfoxxxx("They said yes., Imbaga da On.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("He");
        loDetail.setPrnction("He");
        loDetail.setWordType("Pronoun");
        loDetail.setDescript("Used to refer to a man - boy - or male animal previously mentioned or easily identified.");
        loDetail.setTransLte("Sikato");
        loDetail.setInfoxxxx("He is the one for me., Sikato so parad siak.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("They");
        loDetail.setPrnction("They");
        loDetail.setWordType("Pronoun");
        loDetail.setDescript("Use to refer to tow or more people or things previously mentioned or easily identified");
        loDetail.setTransLte("Sikara");
        loDetail.setInfoxxxx("They bought our house., Sikara so angaliw ya abong tayo.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("We");
        loDetail.setPrnction("We");
        loDetail.setWordType("Pronoun");
        loDetail.setDescript("Used by a speaker to refer to himself or herself and one or more other people considered together");
        loDetail.setTransLte("Sikatayo, Sikami");
        loDetail.setInfoxxxx("We are his children., Sikami so anak to.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Who");
        loDetail.setPrnction("Who");
        loDetail.setWordType("Pronoun");
        loDetail.setDescript("Used primarily to refer to persons");
        loDetail.setTransLte("Siopa, Opa");
        loDetail.setInfoxxxx("Who bought our house?, Siopa so angaliw yaabong tayo?");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("No");
        loDetail.setPrnction("No");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A negative answer or decision - as in voting.");
        loDetail.setTransLte("Andi");
        loDetail.setInfoxxxx("No! You're going., Andi! Agka oonla.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("January");
        loDetail.setPrnction("Jan-u-ar-y");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The first month of the year - in the northern hemisphere usually considered the second month of winter.");
        loDetail.setTransLte("Enero");
        loDetail.setInfoxxxx("Our fight is in January., No enero so laban mi.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Entrance");
        loDetail.setPrnction("En-trance");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An opening - such as a door - passage - or gate - that allows access to a place.");
        loDetail.setTransLte("Looban");
        loDetail.setInfoxxxx("Where is the entrance?, Iner so looban?");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Exit");
        loDetail.setPrnction("Ex-it");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A way out, especially of a public building - room - or passenger vehicle.");
        loDetail.setTransLte("Labasan");
        loDetail.setInfoxxxx("There is the exit., Diman so labasan.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Vacant");
        loDetail.setPrnction("Va-cant");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Having no contents; empty; void");
        loDetail.setTransLte("Bakanti");
        loDetail.setInfoxxxx("Do you have a vacant room?, Walay bakanti yo na kwarto?");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Free");
        loDetail.setPrnction("Free");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("Without cost or payment.");
        loDetail.setTransLte("Libre");
        loDetail.setInfoxxxx("I got free food., Akala ak ya libre ya naakan.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Danger");
        loDetail.setPrnction("Dan-ger");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The possibility of suffering harm or injury.");
        loDetail.setTransLte("Piligro");
        loDetail.setInfoxxxx("I'm in danger., Wala ak ed piligro.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Dangerous");
        loDetail.setPrnction("Dan-ger-ous");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Able or likely to cause harm or injury.");
        loDetail.setTransLte("Piligroso");
        loDetail.setInfoxxxx("This food is dangerous., Ang pagkain na ito ay piligroso.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Luck");
        loDetail.setPrnction("Luck");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Success or failure apparently brought by chance rather than through one's own actions.");
        loDetail.setTransLte("Suerte");
        loDetail.setInfoxxxx("I am very lucky in life., Agaylay suertik ed bilay.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Private");
        loDetail.setPrnction("Pri-vate");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Belonging to or for the use of one particular person or group of people only.");
        loDetail.setTransLte("Pribado");
        loDetail.setInfoxxxx("This is a private vehicle., Pribado ya na luluganan.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Door");
        loDetail.setPrnction("Door");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A hinged, sliding - or revolving barrier at the entrance to a building - room - or vehicle - or in the framework of a cupboard.");
        loDetail.setTransLte("Puerta, Kapot");
        loDetail.setInfoxxxx("Open the door., Lukasan mo may puerta.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Water");
        loDetail.setPrnction("Wa-ter");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A colorless - transparent - odorless liquid that forms the seas - lakes - rivers - and rain and is the basis of the fluids of living organisms.");
        loDetail.setTransLte("Danum");
        loDetail.setInfoxxxx("Get me some water., Iyalaan mo ak pa ya danum.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Wait");
        loDetail.setPrnction("Wait");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Stay where one is or delay action until a particular time or until something else happens.");
        loDetail.setTransLte("Alagar");
        loDetail.setInfoxxxx("Wait for me., Alagar mo ak.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Left");
        loDetail.setPrnction("Left");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("On, toward - or relating to the side of a human body or of a thing that is to the west when the person or thing is facing north.");
        loDetail.setTransLte("Kawigi");
        loDetail.setInfoxxxx("Let's go to the left., Unla tayo ed kawigi.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Right");
        loDetail.setPrnction("Right");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Allowing access - passage - or a view through an empty space; not closed or blocked up.");
        loDetail.setTransLte("Kawanan");
        loDetail.setInfoxxxx("Let's go to the right., Unla tayo ed kawanan.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Police");
        loDetail.setPrnction("Po-lice");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The civil force of a national or local government - responsible for the prevention and detection of crime and the maintenance of public order.");
        loDetail.setTransLte("Polisya, Pulis");
        loDetail.setInfoxxxx("They talked to the local police commander., Akitongtong ira ed lokal a komander na polisya.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Open");
        loDetail.setPrnction("O-pen");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Allowing access - passage - or a view through an empty space; not closed or blocked up.");
        loDetail.setTransLte("Lukas, Alukasan, Lukasan");
        loDetail.setInfoxxxx("Open the door., Lukasan mo may puerta.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Close");
        loDetail.setPrnction("Close");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("The state of something not being open.");
        loDetail.setTransLte("Kaput, Ikaput, Sarado");
        loDetail.setInfoxxxx("Close to the door., Ikaput mo may puerta.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Toilet");
        loDetail.setPrnction("Toi-let");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A fixed receptacle into which a person may urinate or defecate - typically consisting of a large bowl connected to a system for flushing away the waste into a sewer or septic tank.");
        loDetail.setTransLte("Kasilyas");
        loDetail.setInfoxxxx("Where is the toilet?, Iner so kasilyas?");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Song");
        loDetail.setPrnction("Song");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A short poem or other set of words set to music or meant to be sung.");
        loDetail.setTransLte("Kansion");
        loDetail.setInfoxxxx("That's a beautiful song., Marakdakep itan a kansion.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("While");
        loDetail.setPrnction("While");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A period of time.");
        loDetail.setTransLte("Lenag, Lapud");
        loDetail.setInfoxxxx("I study while working., Manaaral ak lenag na mantratrabaho.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("February");
        loDetail.setPrnction("Feb-ru-ar-y");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The second month of the year - in the northern hemisphere usually considered the last month of winter.");
        loDetail.setTransLte("Pebrero");
        loDetail.setInfoxxxx("February is the day of hearts., Pebrero so agew ya puso.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);
        //30
        loDetail = new EDictionaryWords();
        loDetail.setWordName("March");
        loDetail.setPrnction("March");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The third month of the year - in the northern hemisphere usually considered the first month of spring.");
        loDetail.setTransLte("Marso");
        loDetail.setInfoxxxx("Our graduation is in march., Marso so graduasyon mi.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("April");
        loDetail.setPrnction("A-pril");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The fourth month of the year - in the northern hemisphere usually considered the second month of spring.");
        loDetail.setTransLte("Abril");
        loDetail.setInfoxxxx("We will travel in april., Onbiahe kami ed abril.  ");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("May");
        loDetail.setPrnction("May");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The fifth month of the year - in the northern hemisphere usually considered the last month of spring.");
        loDetail.setTransLte("Mayo");
        loDetail.setInfoxxxx("May is my birthday., Mayo so agew ya inkiyanak ko.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("June");
        loDetail.setPrnction("June");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The sixth month of the year - in the northern hemisphere usually considered the first month of summer.");
        loDetail.setTransLte("Hunyo");
        loDetail.setInfoxxxx("Class starts in June., June so gapoan ya  klase.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Bath");
        loDetail.setPrnction("Bath");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An act or process of immersing and washing one's body in a large container of water.");
        loDetail.setTransLte("Ames, Manames");
        loDetail.setInfoxxxx("Let's take a bath in the ocean., Manames tayo ed dayat.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Knock");
        loDetail.setPrnction("Knock");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A sudden short sound caused by a blow - especially on a door to attract attention or gain entry.");
        loDetail.setTransLte("Toktok, Ontoktok");
        loDetail.setInfoxxxx("Knock first before entering., Toktok ni bago Onloob");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Reserve");
        loDetail.setPrnction("Re-serve");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A supply of a commodity not needed for immediate use but available if required.");
        loDetail.setTransLte("Reserba");
        loDetail.setInfoxxxx("We have a lot of reserves in basketball. Dakel so reserba mi ed basketbol.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Careful");
        loDetail.setPrnction("Care-ful");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Making sure of avoiding potential danger - mishap - or harm; cautious.");
        loDetail.setTransLte("Manalwar");
        loDetail.setInfoxxxx("Be careful while you are driving., Manalwar ka ta lenag moy manmaneho.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Time");
        loDetail.setPrnction("Time");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A point of time as measured in hours and minutes past midnight or noon.");
        loDetail.setTransLte("Oras");
        loDetail.setInfoxxxx("What time is it?, Anto lay oras?");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Its");
        loDetail.setPrnction("Its");
        loDetail.setWordType("Determiner");
        loDetail.setDescript("Belonging to or associated with a thing previously mentioned or easily identified.");
        loDetail.setTransLte("Say");
        loDetail.setInfoxxxx("Its called Basketball., Say tawag da et Basketbol.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Early");
        loDetail.setPrnction("Ear-ly");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Happening or done before the usual or expected time.");
        loDetail.setTransLte("Masakbay");
        loDetail.setInfoxxxx("You should come early., Masakbay kan Onsabi a.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Late");
        loDetail.setPrnction("Late");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("After the expected - proper - or usual time.");
        loDetail.setTransLte("Atrasado");
        loDetail.setInfoxxxx("Are you going home late?, Atrasado ka lan onsimpit?");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Here");
        loDetail.setPrnction("Here");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("In - at - or to this place or position.");
        loDetail.setTransLte("Dia");
        loDetail.setInfoxxxx("Come here now., Galalad dia natan.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Rest");
        loDetail.setPrnction("Rest");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An instance or period of relaxing or ceasing to engage in strenuous or stressful activity.");
        loDetail.setTransLte("Painawa");
        loDetail.setInfoxxxx("Let's rest first., Painawa tini.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Today");
        loDetail.setPrnction("To-day");
        loDetail.setWordType("Noun");
        loDetail.setDescript("This present day.");
        loDetail.setTransLte("Natan");
        loDetail.setInfoxxxx("Today is a day of rest., Natan ya agew et painawa");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Yesterday");
        loDetail.setPrnction("Yes-ter-day");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The day before today.");
        loDetail.setTransLte("Karuman");
        loDetail.setInfoxxxx("Yesterday we went to the beach., Linma kami ed dayat karuman.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Tomorrow");
        loDetail.setPrnction("To-mor-row");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The day after today.");
        loDetail.setTransLte("Nabuas");
        loDetail.setInfoxxxx("He leaves tomorrow., Onalis sikato nabuas.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Leave");
        loDetail.setPrnction("Leave");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Go away from.");
        loDetail.setTransLte("Onalis, Ontaynan");
        loDetail.setInfoxxxx("He leaves tomorrow., Onalis siakto nabuas.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Morning");
        loDetail.setPrnction("Morn-ing");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The part of the day which follows noon - between noon and evening.");
        loDetail.setTransLte("Kabuasan ");
        loDetail.setInfoxxxx("We will leave in the morning., Kabuasan tayo onalis.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Afternoon");
        loDetail.setPrnction("Af-ter-noon");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The part of the day which follows noon - between noon and evening");
        loDetail.setTransLte("Ugto");
        loDetail.setInfoxxxx("You arrived in the afternoon., Ugto kala simabi.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);


        loDetail = new EDictionaryWords();
        loDetail.setWordName("Noon");
        loDetail.setPrnction("Noon");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Twelve o'clock in the day; midday.");
        loDetail.setTransLte("Ngarem");
        loDetail.setInfoxxxx("It's already noon., Ngarem la.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Evening");
        loDetail.setPrnction("Eve-ning");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The period of time at the end of the day - usually from about 6 p.m. to bedtime.");
        loDetail.setTransLte("Labi");
        loDetail.setInfoxxxx("Good Evening., Masantos ya Labi.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ocean");
        loDetail.setPrnction("O-cean");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A very large expanse of sea - in particular each of the main areas into which the sea is divided geographically.");
        loDetail.setTransLte("Dayat");
        loDetail.setInfoxxxx("Let's take a bath on the ocean., Man amis tayo ed dayat.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("July");
        loDetail.setPrnction("Ju-ly");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The seventh month of the year - in the northern hemisphere usually considered the second month of summer.");
        loDetail.setTransLte("Hulyo");
        loDetail.setInfoxxxx("My brother will come home in July., Onsempit si kuyak no hulyo.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("August");
        loDetail.setPrnction("Au-gust");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The eighth month of the year - in the northern hemisphere usually considered the last month of summer.");
        loDetail.setTransLte("Agosto");
        loDetail.setInfoxxxx("We will meet in August., Makapaningnigan kami la ed Agosto.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("September");
        loDetail.setPrnction("Sep-tem-ber");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The ninth month of the year - in the northern hemisphere usually considered the first month of autumn.");
        loDetail.setTransLte("Setyembre");
        loDetail.setInfoxxxx("It's September tomorrow., Setyembre la nabwas.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Week");
        loDetail.setPrnction("Week");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A period of seven days.");
        loDetail.setTransLte("Simba");
        loDetail.setInfoxxxx("We were only there for a week., Sakey simba kami labat diman.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Month");
        loDetail.setPrnction("Month");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Each of the twelve named periods into which a year is divided.");
        loDetail.setTransLte("Bulan");
        loDetail.setInfoxxxx("My birthday is just a few months away., Pigaran bulan labat la agew na inkiyanak ko la.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("October");
        loDetail.setPrnction("Oc-to-ber");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The tenth month of the year - in the northern hemisphere usually considered the second month of autumn.");
        loDetail.setTransLte("Oktubre");
        loDetail.setInfoxxxx("The project started in october., Say proyekto nan ompisa nin oktubre.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Year");
        loDetail.setPrnction("Year");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The time taken by the earth to make one revolution around the sun.");
        loDetail.setTransLte("Taon");
        loDetail.setInfoxxxx("Happy New Year., Maliket na balon taon.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("New");
        loDetail.setPrnction("New");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Already existing but seen - experienced - or acquired recently or now for the first time.");
        loDetail.setTransLte("Balo");
        loDetail.setInfoxxxx("I have new shoes., Walay balon sapatos ko.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("November");
        loDetail.setPrnction("No-vem-ber");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The eleventh month of the year - in the northern hemisphere usually considered the last month of autumn.");
        loDetail.setTransLte("Nobyembre");
        loDetail.setInfoxxxx("The store opened in november., Nanlukas may lakoan nin nobyembre.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("December");
        loDetail.setPrnction("De-cem-ber");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The twelfth month of the year - in the northern hemisphere usually considered the first month of winter.");
        loDetail.setTransLte("Disyembre");
        loDetail.setInfoxxxx("Christmas is celebrated in december., Disyembre so selebrasyon na krismas.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("First");
        loDetail.setPrnction("First");
        loDetail.setWordType("Number");
        loDetail.setDescript("Coming before all others in time or order; earliest; 1st.");
        loDetail.setTransLte("Unona");
        loDetail.setInfoxxxx("You are the first to leave., Sika so unona ya onalis.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Second");
        loDetail.setPrnction("Sec-ond");
        loDetail.setWordType("Number");
        loDetail.setDescript("Constituting number two in a sequence; coming after the first in time or order; 2nd.");
        loDetail.setTransLte("Komadua");
        loDetail.setInfoxxxx("You are the second to leave., Sika so komadua ya onalis.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Third");
        loDetail.setPrnction("Third");
        loDetail.setWordType("Number");
        loDetail.setDescript("Constituting number three in a sequence; 3rd.");
        loDetail.setTransLte("Komatlo");
        loDetail.setInfoxxxx("He chose a third option., Inunor to so komatlon napampilian.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Fourth");
        loDetail.setPrnction("Fourth");
        loDetail.setWordType("Number");
        loDetail.setDescript("Constituting number four in a sequence; 4th.");
        loDetail.setTransLte("Komapat");
        loDetail.setInfoxxxx("You are the Fourth to leave., Sika so komapat ya onalis.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Fifth");
        loDetail.setPrnction("Fifth");
        loDetail.setWordType("Number");
        loDetail.setDescript("Constituting number five in a sequence; 5th.");
        loDetail.setTransLte("Komalima");
        loDetail.setInfoxxxx("He finished fifth., Asumpal siakto ya komalima.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Sixth");
        loDetail.setPrnction("Sixth");
        loDetail.setWordType("Number");
        loDetail.setDescript("Constituting number six in a sequence; 6th.");
        loDetail.setTransLte("Komanem");
        loDetail.setInfoxxxx("He is the sixth among siblings., Komanem sikato ed san aagi.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Seventh");
        loDetail.setPrnction("Sev-ent");
        loDetail.setWordType("Number");
        loDetail.setDescript("Constituting number seven in a sequence; 7th.");
        loDetail.setTransLte("Komapito");
        loDetail.setInfoxxxx("His seventh goal of the season., Say komapiton gol to ed sayan taon.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Eighth");
        loDetail.setPrnction("Eighth");
        loDetail.setWordType("Number");
        loDetail.setDescript("Constituting number eight in a sequence; 8th.");
        loDetail.setTransLte("Komawalo");
        loDetail.setInfoxxxx("He is the eighth among the winners., Sikato so komawaloan ed saray analo.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ninth");
        loDetail.setPrnction("Ninth");
        loDetail.setWordType("Number");
        loDetail.setDescript("Constituting number nine in a sequence; 9th.");
        loDetail.setTransLte("Komasiam");
        loDetail.setInfoxxxx("You are ninth in the contest., Sika so komasiam ed kompetisyon.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Tenth");
        loDetail.setPrnction("Tenth");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Constituting number ten in a sequence; 10th.");
        loDetail.setTransLte("Komasamplo");
        loDetail.setInfoxxxx("You are tenth in class., Komasamplo ka ed klase.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Hundred");
        loDetail.setPrnction("Hun-dred");
        loDetail.setWordType("Number");
        loDetail.setDescript("The number equivalent to the product of ten and ten; ten more than ninety; 100.");
        loDetail.setTransLte("Sanlasos");
        loDetail.setInfoxxxx("My money is only a hundred., Say kuartak et sanlasos labat.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Thousand");
        loDetail.setPrnction("Thou·sand");
        loDetail.setWordType("Number");
        loDetail.setDescript("The number equivalent to the product of a hundred and ten; 1000.");
        loDetail.setTransLte("Sanlibon");
        loDetail.setInfoxxxx("Thousands of people attended the event., Nilibon totoo so inmatendi ed sayan okasyon.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Million");
        loDetail.setPrnction("Mil·lion");
        loDetail.setWordType("Number");
        loDetail.setDescript("The number equivalent to the product of a thousand and a thousand; 1000000 or 106.");
        loDetail.setTransLte("Milyon");
        loDetail.setInfoxxxx("A million people will benefit., Sakey milyon a totoo so nagunggonaan.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Where");
        loDetail.setPrnction("Where");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("In or to what place or position.");
        loDetail.setTransLte("Iner");
        loDetail.setInfoxxxx("Where do you live?, Iner so panaayaman mo? ");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Hate");
        loDetail.setPrnction("Hate");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Feel intense or passionate dislike for (someone).");
        loDetail.setTransLte("Kabusol, Kagula");
        loDetail.setInfoxxxx("I hate you., Kabusol ta ka.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("When");
        loDetail.setPrnction("When");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("At what time.");
        loDetail.setTransLte("Kapigan, Pigan");
        loDetail.setInfoxxxx("When did you last see him?, Kapigan so unor lan impakanengneng yo ed sikato?");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("What");
        loDetail.setPrnction("What");
        loDetail.setWordType("Pronoun");
        loDetail.setDescript("Asking for information specifying something.");
        loDetail.setTransLte("Anto");
        loDetail.setInfoxxxx("What is your name?, Anto so ngaran mo?");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("How");
        loDetail.setPrnction("How");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("In what way or manner; by what means.");
        loDetail.setTransLte("Pano, Panon");
        loDetail.setInfoxxxx("How does it work?, Panon itan ya nagagawa?");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Why");
        loDetail.setPrnction("Why");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("For what cause - reason - or purpose");
        loDetail.setTransLte("Akin");
        loDetail.setInfoxxxx("Why did you do it?, Akin et ginawam itan?");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Which");
        loDetail.setPrnction("Which");
        loDetail.setWordType("Pronoun");
        loDetail.setDescript("Asking for information specifying one or more people or things from a definite set.");
        loDetail.setTransLte("Dinan");
        loDetail.setInfoxxxx("Which of them?, Dinan ed sikara?");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Name");
        loDetail.setPrnction("Name");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A word or set of words by which a person - animal - place - or thing is known - addressed - or referred to.");
        loDetail.setTransLte("Ngaran");
        loDetail.setInfoxxxx("My name is Parsons, John Parsons., Say ngaran ko et Parsons, John Parsons.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("See");
        loDetail.setPrnction("See");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Perceive with the eyes; discern visually.");
        loDetail.setTransLte("Nengnengen, Anengneng");
        loDetail.setInfoxxxx("In the distance she could see the blue sea., Diad arawi et nanengneng toy asul a dayat.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Call");
        loDetail.setPrnction("Call");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Cry out (a word or words).");
        loDetail.setTransLte("Ontawag, Tawag");
        loDetail.setInfoxxxx("He heard an insistent voice calling his name., Nadngel to so mapekder ya boses ya ontatawag ed ngaran to.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Start");
        loDetail.setPrnction("Start");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Begin or be reckoned from a particular point in time or space.");
        loDetail.setTransLte("Gapo, Igapo, Onggapo");
        loDetail.setInfoxxxx("The race starts in Setyembre., Onggapo so lumba no Setyembre.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Contest");
        loDetail.setPrnction("Con-test");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An event in which people compete for supremacy in a sport - activity - or particular quality.");
        loDetail.setTransLte("Kompetisyon");
        loDetail.setInfoxxxx("Who will win in bike contest?, Siopa so manalo ed kompetisyon na bisikleta?");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Bike");
        loDetail.setPrnction("Bike");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A bicycle or motorcycle.");
        loDetail.setTransLte("Bisikleta");
        loDetail.setInfoxxxx("Who will win in bike contest?, Siopa so manalo ed kompetisyon na bisikleta?");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Meaning");
        loDetail.setPrnction("Mean-ing");
        loDetail.setWordType("Noun");
        loDetail.setDescript("What is meant by a word - text - concept - or action.");
        loDetail.setTransLte("Kabaliksan, Panamegley");
        loDetail.setInfoxxxx("What Does It Really Mean?, Anto so Talagan Kabaliksan na Satan?");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Understand");
        loDetail.setPrnction("Un-der-stand");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Perceive the intended meaning of (words - a language - or a speaker).");
        loDetail.setTransLte("Talosan");
        loDetail.setInfoxxxx("He didn't understand a word I said., Agto atalosan so anggan sakey a salita ya imbagak. ");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Project");
        loDetail.setPrnction("Proj-ect");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An individual or collaborative enterprise that is carefully planned to achieve a particular aim.");
        loDetail.setTransLte("Proyekto");
        loDetail.setInfoxxxx("We have a lot of project., Dakel so proyekto mi.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Benefit");
        loDetail.setPrnction("Ben-e-fit");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An advantage or profit gained from something.");
        loDetail.setTransLte("Gunggona");
        loDetail.setInfoxxxx("What is my benefit for being with you?, Anto so nagunggona ed siak lapud piulop kod sika?");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Best");
        loDetail.setPrnction("Best");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Of the most excellent - effective - or desirable type or quality.");
        loDetail.setTransLte("Sankaabigan, Kamaongan");
        loDetail.setInfoxxxx("The best pitcher in the league., Say sankaabigan a pitcher ed liga.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Really");
        loDetail.setPrnction("Re-al-ly");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("In actual fact - as opposed to what is said or imagined to be true or possible.");
        loDetail.setTransLte("Talaga");
        loDetail.setInfoxxxx("What really happened?, Antoy talagan agawa?");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Bite");
        loDetail.setPrnction("Bite");
        loDetail.setWordType("Verb");
        loDetail.setDescript("(of a person or animal) use the teeth to cut into or through something.");
        loDetail.setTransLte("Ketket");
        loDetail.setInfoxxxx("What really happened?, Antoy talagan agawa?");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Blind");
        loDetail.setPrnction("Blind");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Cause (someone) to be unable to see - permanently or temporarily.");
        loDetail.setTransLte("Bulag");
        loDetail.setInfoxxxx("The injury temporarily blinded him., Sikatoy temporaryon abulag lapud sugat to.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Cheat");
        loDetail.setPrnction("Cheat");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Act dishonestly or unfairly in order to gain an advantage - especially in a game or examination.");
        loDetail.setTransLte("Masaol");
        loDetail.setInfoxxxx("You are cheating on our quiz., Mansasaol ka ed quiz tayo.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Childhood");
        loDetail.setPrnction("Child-hood");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The state of being a child.");
        loDetail.setTransLte("Inkaugaw, Inkatobonbalo");
        loDetail.setInfoxxxx("The idealized world of childhood., Say idealized a mundo na inkaugaw.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Dream");
        loDetail.setPrnction("Dream");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A series of thoughts - images - and sensations occurring in a person's mind during sleep.");
        loDetail.setTransLte("Kugip");
        loDetail.setInfoxxxx("I had a dream about you., Akupkugip taka.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Take");
        loDetail.setPrnction("Take");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Remove (someone or something) from a particular place.");
        loDetail.setTransLte("Ala, Alaen");
        loDetail.setInfoxxxx("He took an envelope from his inside pocket., Inala to so sobre manlapud loob na bulsa to.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Farmer");
        loDetail.setPrnction("Farm-er");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A person who owns or manages a farm.");
        loDetail.setTransLte("Dumaralos, Managtaneman");
        loDetail.setInfoxxxx("My father is a farmer., Say tatay koy dumaralos.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Study");
        loDetail.setPrnction("Stud-y");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The devotion of time and attention to acquiring knowledge on an academic subject - especially by means of books.");
        loDetail.setTransLte("Nanaral, Aral");
        loDetail.setInfoxxxx("I'm studying for our quiz., Manaaral ak parad quiz tayo.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("School");
        loDetail.setPrnction("School");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An institution for educating children.");
        loDetail.setTransLte("Eskuelaan, Abong-Aralan");
        loDetail.setInfoxxxx("I'm going to school now., Onla ak la natan ed eskuelaan.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Awake");
        loDetail.setPrnction("A-wake");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Stop sleeping; wake from sleep.");
        loDetail.setTransLte("Bangon");
        loDetail.setInfoxxxx("She awoke to find the streets covered in snow., Sikatoy binmangon tan anengneng to a saray karsada et napnoy niebe.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Foreigner");
        loDetail.setPrnction("For-eign-er");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A person born in or coming from a country other than one's own.");
        loDetail.setTransLte("Dayo");
        loDetail.setInfoxxxx("Are you the only foreigners here?, Sikayo labat kasi so dayo dia?.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Accompany");
        loDetail.setPrnction("Ac-com-pa-ny");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Go somewhere with (someone) as a companion or escort.");
        loDetail.setTransLte("Ibaan");
        loDetail.setInfoxxxx("They accompanied me., Inibaan da ak.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Teach");
        loDetail.setPrnction("Teach");
        loDetail.setWordType("Verb");
        loDetail.setDescript("show or explain to (someone) how to do something.");
        loDetail.setTransLte("Ibangat");
        loDetail.setInfoxxxx("She taught him to read., Sikatoy angibangat ed sikato na panagbasa.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Involve");
        loDetail.setPrnction("In-volve");
        loDetail.setWordType("Verb");
        loDetail.setDescript("(of a situation or event) include (something) as a necessary part or result.");
        loDetail.setTransLte("Idamay, Nalanor, Mibiang");
        loDetail.setInfoxxxx("");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Drink");
        loDetail.setPrnction("Drink");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Take (a liquid) into the mouth and swallow.");
        loDetail.setTransLte("Inom, Inumen");
        loDetail.setInfoxxxx("We sat by the fire and drinking our coffee., Inmirung kami ed abay na apoy tan inminom kami na kape.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Bury");
        loDetail.setPrnction("Bur-y");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Put or hide under ground.");
        loDetail.setTransLte("Inkotkot, Imponpon");
        loDetail.setInfoxxxx("He buried the box in the back garden., Inkotkot to so kahon diad beneg a hardin.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Cook");
        loDetail.setPrnction("Cook");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Prepare (food - a dish, or a meal) by combining and heating the ingredients in various ways., ");
        loDetail.setTransLte("Luto, Iluto");
        loDetail.setInfoxxxx("Shall I cook dinner tonight?, Kasin manluto ak na pangdem ed sayan labi? ");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Love");
        loDetail.setPrnction("Love");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An intense feeling of deep affection.");
        loDetail.setTransLte("Aro, Inaro, Pangaro");
        loDetail.setInfoxxxx("Babies fill parents with feelings of love., Saray ugugaw so mangiter ed atateng na liknaan na aro.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Dead");
        loDetail.setPrnction("Dead");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("No longer alive.");
        loDetail.setTransLte("Inatey");
        loDetail.setInfoxxxx("My chicken died., Inatey may manok ko.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Lend");
        loDetail.setPrnction("Lend");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Grant to (someone) the use of (something) on the understanding that it shall be returned.");
        loDetail.setTransLte("Ipautang, Pabayesen");
        loDetail.setInfoxxxx("Stewart asked me to lend him my car., Kinerew nen Stewart ya ipabayes koy luluganan ko.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Pray");
        loDetail.setPrnction("Pray");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Grant to (someone) the use of (something) on the understanding that it shall be returned.");
        loDetail.setTransLte("Ipikasi");
        loDetail.setInfoxxxx("Pray for me., Manpikasi kayo parad siak.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Friend");
        loDetail.setPrnction("Friend");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A person whom one knows and with whom one has a bond of mutual affection - typically exclusive of sexual or family relations.");
        loDetail.setTransLte("Kaaro");
        loDetail.setInfoxxxx("She's a friend of mine., Sikatoy kaarok.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Lazy");
        loDetail.setPrnction("La-zy");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Unwilling to work or use energy.");
        loDetail.setTransLte("Mangiras");
        loDetail.setInfoxxxx("He was too lazy to cook., Sikatoy mangiras a manluto.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Believe");
        loDetail.setPrnction("Be-lieve");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Accept (something) as true; feel sure of the truth of.");
        loDetail.setTransLte("Manisia, Anisia");
        loDetail.setInfoxxxx("The superintendent believed Lancaster's story., Anisia so superintendent ed istorya nen Lancaster.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Tired");
        loDetail.setPrnction("Tired");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("In need of sleep or rest; weary.");
        loDetail.setTransLte("Naksawan");
        loDetail.setInfoxxxx("I'm tired of working., Naknaksawan ak lan mantrabaho.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Slow");
        loDetail.setPrnction("Slow");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Moving or operating, or designed to do so, only at a low speed; not quick or fast.");
        loDetail.setTransLte("Matantan, Mapalna");
        loDetail.setInfoxxxx("You are so slow., Talagan matantan ka.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Soup");
        loDetail.setPrnction("Soup");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A liquid dish - typically made by boiling meat - fish - or vegetables - etc. - in stock or water.");
        loDetail.setTransLte("Sabaw");
        loDetail.setInfoxxxx("The waves and the water beyond have become a thick  soup., Saray daluyon tan say danum ed paway et nagmaliw a makapal ya sopas. ");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Blow");
        loDetail.setPrnction("Blow");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Expel air through pursed lips.");
        loDetail.setTransLte("Sibok");
        loDetail.setInfoxxxx("Blow the candle., Sibokan moy kandila.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Repeat");
        loDetail.setPrnction("Re-peat");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Do (something) again - either once or a number of times.");
        loDetail.setTransLte("Uliten");
        loDetail.setInfoxxxx("Repeat it., Ulit mo.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Fish");
        loDetail.setPrnction("Fish");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A limbless cold-blooded vertebrate animal with gills and fins and living wholly in water.");
        loDetail.setTransLte("Sira");
        loDetail.setInfoxxxx("I sell fish., Mangilako ak na sira.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Have");
        loDetail.setPrnction("Have");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Possess - own - or hold.");
        loDetail.setTransLte("Wala");
        loDetail.setInfoxxxx("I have fish., Walay sirak.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Big");
        loDetail.setPrnction("Big");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Of considerable size - extent - or intensity.");
        loDetail.setTransLte("Baleg");
        loDetail.setInfoxxxx("It's a big decision., Baleg itan a desisyon.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Small");
        loDetail.setPrnction("Small");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Of a size that is less than normal or usual.");
        loDetail.setTransLte("Melag");
        loDetail.setInfoxxxx("The room was small and quiet., Melag tan mareen so kuarto.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Fast");
        loDetail.setPrnction("Fast");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Moving or capable of moving at high speed.");
        loDetail.setTransLte("Maples");
        loDetail.setInfoxxxx("A fast and powerful car., Maples tan makapanyari ya kotse.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Quiet");
        loDetail.setPrnction("Qui-et");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Making little or no noise.");
        loDetail.setTransLte("Mareen");
        loDetail.setInfoxxxx("The car has a quiet., Say luluganan et mareen.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Vehicle");
        loDetail.setPrnction("Ve-hi-cle");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A thing used for transporting people or goods - especially on land - such as a car or truck.");
        loDetail.setTransLte("Luluganan");
        loDetail.setInfoxxxx("I have A vehicle., Walay luluganan ko.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Cheap");
        loDetail.setPrnction("Cheap");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("(of an item for sale) low in price; worth more than its cost.");
        loDetail.setTransLte("Mura");
        loDetail.setInfoxxxx("They bought some cheap fruit., Angaliw ira na mamuran prutas.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Expensive");
        loDetail.setPrnction("Ex-pen-sive");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Costing a lot of money.");
        loDetail.setTransLte("Mabli");
        loDetail.setInfoxxxx("Your clothes are expensive., Mabmabli iray kawes mo.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Near");
        loDetail.setPrnction("Near");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("At or to a short distance away; nearby.");
        loDetail.setTransLte("Asingger");
        loDetail.setInfoxxxx("I'm near., Asingger ak la.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Far");
        loDetail.setPrnction("Far");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("At - to - or by a great distance (used to indicate the extent to which one thing is distant from another).");
        loDetail.setTransLte("Arawi");
        loDetail.setInfoxxxx("Your house is very far away., Arawi so abung yo. ");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Hot");
        loDetail.setPrnction("Hot");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Having a high degree of heat or a high temperature.");
        loDetail.setTransLte("Ampetang");
        loDetail.setInfoxxxx("I wish you were hot., Komon ta ampetang ka.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Cold");
        loDetail.setPrnction("Cold");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Of or at a low or relatively low temperature - especially when compared with the human body.");
        loDetail.setTransLte("Ambetel");
        loDetail.setInfoxxxx("I wish you were cold., Komon ta ambetel ka.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Full");
        loDetail.setPrnction("Full");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Containing or holding as much or as many as possible; having no empty space.");
        loDetail.setTransLte("Napno");
        loDetail.setInfoxxxx("Wastebaskets full of rubbish., Saray basuraan a napno na basura.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Nothing");
        loDetail.setPrnction("Noth-ing");
        loDetail.setWordType("Pronoun");
        loDetail.setDescript("Not anything; no single thing.");
        loDetail.setTransLte("Anggapo");
        loDetail.setInfoxxxx("I said nothing., Anggapoy imbagak.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Easy");
        loDetail.setPrnction("Eas-y");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Achieved without great effort; presenting few difficulties.");
        loDetail.setTransLte("Mainomay");
        loDetail.setInfoxxxx("The quiz is easy., Mainomay so quiz.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Difficult");
        loDetail.setPrnction("Dif-fi-cult");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Needing much effort or skill to accomplish - deal with - or understand.");
        loDetail.setTransLte("Mairap");
        loDetail.setInfoxxxx("The quiz is so difficult., Mairap so quiz.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Heavy");
        loDetail.setPrnction("Heav-y");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Of great weight; difficult to lift or move.");
        loDetail.setTransLte("Belat, Ambelat");
        loDetail.setInfoxxxx("The pan was too heavy for me to carry., Mabelat so pan ya awiten ko.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Light");
        loDetail.setPrnction("Light");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("(physics, chemistry) not having atomic weight greater than average.");
        loDetail.setTransLte("Alemew");
        loDetail.setInfoxxxx("I carry only a very light magazine bag., Alemew labat ya bag so aawiten ko.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Carry");
        loDetail.setPrnction("Car-ry");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Support and move (someone or something) from one place to another.");
        loDetail.setTransLte("Awiten");
        loDetail.setInfoxxxx("The pan was too heavy for me to carry., Mabelat so pan ya awiten ko.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Powerful");
        loDetail.setPrnction("Pow-er-ful");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Having control and influence over people and events.");
        loDetail.setTransLte("Makapanyari");
        loDetail.setInfoxxxx("The world's most powerful nation., Sankamakapanyarin bansa ed mundo.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Bad");
        loDetail.setPrnction("Bad");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Of poor quality or a low standard.");
        loDetail.setTransLte("Mauges");
        loDetail.setInfoxxxx("It's bad for you., Mauges tan ed sika.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Good");
        loDetail.setPrnction("Good");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("To be desired or approved of.");
        loDetail.setTransLte("Maong, Maabig");
        loDetail.setInfoxxxx("A good quality of life., Maong a kalidad na bilay.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Help");
        loDetail.setPrnction("Help");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The action of helping someone to do something; assistance.");
        loDetail.setTransLte("Tulong");
        loDetail.setInfoxxxx("They helped her., Tinulongan da.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Young");
        loDetail.setPrnction("Young");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Having lived or existed for only a short time");
        loDetail.setTransLte("Ugaw");
        loDetail.setInfoxxxx(" The young girl is very smart., Talagan marunong so ugaw a bii.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Old");
        loDetail.setPrnction("Old");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Having lived for a long time; no longer young.");
        loDetail.setTransLte("Masiken");
        loDetail.setInfoxxxx("My parents are old., Masiken la ray atateng ko.");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);


        //Pangasinan to English
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Siak");
        loDetail.setPrnction("Siak");
        loDetail.setWordType("Pronoun");
        loDetail.setDescript("Used by a speaker to refer to himself or herself as the object of a verb or preposition. ");
        loDetail.setTransLte("I, Me");
        loDetail.setInfoxxxx("Siak so nanluto., I was the one who cooked.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Sika");
        loDetail.setPrnction("Si-ka");
        loDetail.setWordType("Pronoun");
        loDetail.setDescript("The one or ones being addressed");
        loDetail.setTransLte("You");
        loDetail.setInfoxxxx("You are the one i love., Sika so inarok.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("On");
        loDetail.setPrnction("On");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An affirmative answer or decision - especially in voting.");
        loDetail.setTransLte("Yes");
        loDetail.setInfoxxxx("Imbaga da on., They said yes.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Sikato");
        loDetail.setPrnction("Si-ka-to");
        loDetail.setWordType("Pronoun");
        loDetail.setDescript("Used to refer to a man - boy - or male animal previously mentioned or easily identified.");
        loDetail.setTransLte("He");
        loDetail.setInfoxxxx("Sikato so parad siak., He is the one for me.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Sikara");
        loDetail.setPrnction("Si-ka-ra");
        loDetail.setWordType("Pronoun");
        loDetail.setDescript("Use to refer to tow or more people or things previously mentioned or easily identified");
        loDetail.setTransLte("They");
        loDetail.setInfoxxxx("Sikara so angaliw ya abong tayo., They bought our house.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Sikatayo");
        loDetail.setPrnction("Si-ka-ta-yo");
        loDetail.setWordType("Pronoun");
        loDetail.setDescript("Used by a speaker to refer to himself or herself and one or more other people considered together");
        loDetail.setTransLte("We, Us");
        loDetail.setInfoxxxx("Sikami so anak to., We are his children.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Siopa");
        loDetail.setPrnction("Sio-pa");
        loDetail.setWordType("Pronoun");
        loDetail.setDescript("Used primarily to refer to persons");
        loDetail.setTransLte("Who");
        loDetail.setInfoxxxx("Siopa so angaliw yaabong tayo?, Who bought our house?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Andi");
        loDetail.setPrnction("An-di");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A negative answer or decision - as in voting.");
        loDetail.setTransLte("No");
        loDetail.setInfoxxxx("Andi! Agka oonla., No! You're going");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Enero");
        loDetail.setPrnction("E-ne-ro");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The first month of the year - in the northern hemisphere usually considered the second month of winter.");
        loDetail.setTransLte("January");
        loDetail.setInfoxxxx("No enero so laban mi., Our fight is in January.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Looban");
        loDetail.setPrnction("Lo-o-ban");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An opening - such as a door - passage - or gate - that allows access to a place.");
        loDetail.setTransLte("Entrance");
        loDetail.setInfoxxxx("Iner so looban?, Where is the entrance?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Labasan");
        loDetail.setPrnction("La-ba-san");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A way out, especially of a public building - room - or passenger vehicle.");
        loDetail.setTransLte("Exit");
        loDetail.setInfoxxxx("Diman so labasan., There is the exit.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Bakanti");
        loDetail.setPrnction("Ba-kan-ti");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Having no contents; empty; void");
        loDetail.setTransLte("Vacant");
        loDetail.setInfoxxxx("Walay bakanti yo na kwarto?, Do you have a vacant room?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Libre");
        loDetail.setPrnction("Lib-re");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("Without cost or payment.");
        loDetail.setTransLte("Free");
        loDetail.setInfoxxxx("Akala ak ya libre ya naakan., I got free food.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Piligro");
        loDetail.setPrnction("Pi-lig-ro");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The possibility of suffering harm or injury.");
        loDetail.setTransLte("Danger");
        loDetail.setInfoxxxx("Wala ak ed piligro., I'm in danger.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Piligroso");
        loDetail.setPrnction("Pi-lig-ro-so");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Able or likely to cause harm or injury.");
        loDetail.setTransLte("Dangerous");
        loDetail.setInfoxxxx("Ang pagkain na ito ay piligroso., This food is dangerous.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Suerte");
        loDetail.setPrnction("Su-er-te");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Success or failure apparently brought by chance rather than through one's own actions.");
        loDetail.setTransLte("Luck");
        loDetail.setInfoxxxx("Agaylay suertik ed bilay., I am very lucky in life.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Pribado");
        loDetail.setPrnction("Pri-ba-do");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Belonging to or for the use of one particular person or group of people only.");
        loDetail.setTransLte("Private");
        loDetail.setInfoxxxx("Pribado ya na luluganan., This is a private vehicle.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Pu-er-ta");
        loDetail.setPrnction("Puerta");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A hinged, sliding - or revolving barrier at the entrance to a building - room - or vehicle - or in the framework of a cupboard.");
        loDetail.setTransLte("Door");
        loDetail.setInfoxxxx("Lukasan mo may puerta., Open the door.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Danum");
        loDetail.setPrnction("Da-num");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A colorless - transparent - odorless liquid that forms the seas - lakes - rivers - and rain and is the basis of the fluids of living organisms.");
        loDetail.setTransLte("Water");
        loDetail.setInfoxxxx("Iyalaan mo ak pa ya danum., Get me some water.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Alagar");
        loDetail.setPrnction("A-la-gar");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Stay where one is or delay action until a particular time or until something else happens.");
        loDetail.setTransLte("Wait");
        loDetail.setInfoxxxx("Alagar mo ak., Wait for me.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kawigi");
        loDetail.setPrnction("Ka-wi-gi");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("On, toward - or relating to the side of a human body or of a thing that is to the west when the person or thing is facing north.");
        loDetail.setTransLte("Left");
        loDetail.setInfoxxxx("Unla tayo ed kawigi., Let's go to the left.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kawanan");
        loDetail.setPrnction("Ka-wa-nan");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Allowing access - passage - or a view through an empty space; not closed or blocked up.");
        loDetail.setTransLte("Right");
        loDetail.setInfoxxxx("Unla tayo ed kawanan., Let's go to the right.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Polisya");
        loDetail.setPrnction("Po-li-sya");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The civil force of a national or local government - responsible for the prevention and detection of crime and the maintenance of public order.");
        loDetail.setTransLte("Police");
        loDetail.setInfoxxxx("Akitongtong ira ed lokal a komander na polisya., They talked to the local police commander.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Lukas");
        loDetail.setPrnction("Lu-kas");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Allowing access - passage - or a view through an empty space; not closed or blocked up.");
        loDetail.setTransLte("Open");
        loDetail.setInfoxxxx("Lukasan mo may puerta., Open the door.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kaput");
        loDetail.setPrnction("Ka-put");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("The state of something not being open.");
        loDetail.setTransLte("Close");
        loDetail.setInfoxxxx("Ikaput mo may puerta., Close to the door.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kasilyas");
        loDetail.setPrnction("Ka-sil-yas");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A fixed receptacle into which a person may urinate or defecate - typically consisting of a large bowl connected to a system for flushing away the waste into a sewer or septic tank.");
        loDetail.setTransLte("Toilet");
        loDetail.setInfoxxxx("Iner so kasilyas?, Where is the toilet?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kansion");
        loDetail.setPrnction("Kan-sion");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A short poem or other set of words set to music or meant to be sung.");
        loDetail.setTransLte("Song");
        loDetail.setInfoxxxx("Marakdakep itan a kansion., That's a beautiful song.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Lenag");
        loDetail.setPrnction("Le-nag");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A period of time.");
        loDetail.setTransLte("While");
        loDetail.setInfoxxxx("Manaaral ak lenag na mantratrabaho., I study while working.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Pebrero");
        loDetail.setPrnction("Peb-re-ro");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The second month of the year - in the northern hemisphere usually considered the last month of winter.");
        loDetail.setTransLte("February");
        loDetail.setInfoxxxx("Pebrero so agew ya puso., February is the day of hearts.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Marso");
        loDetail.setPrnction("Mar-so");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The third month of the year - in the northern hemisphere usually considered the first month of spring.");
        loDetail.setTransLte("March");
        loDetail.setInfoxxxx("Marso so graduasyon mi., Our graduation is in march.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Abril");
        loDetail.setPrnction("Ab-ril");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The fourth month of the year - in the northern hemisphere usually considered the second month of spring.");
        loDetail.setTransLte("April");
        loDetail.setInfoxxxx("Onbiahe kami ed abril., We will travel in april.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Mayo");
        loDetail.setPrnction("Ma-yo");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The fifth month of the year - in the northern hemisphere usually considered the last month of spring.");
        loDetail.setTransLte("May");
        loDetail.setInfoxxxx("Mayo so agew ya inkiyanak ko., May is my birthday.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Hunyo");
        loDetail.setPrnction("Hun-yo");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The sixth month of the year - in the northern hemisphere usually considered the first month of summer.");
        loDetail.setTransLte("June");
        loDetail.setInfoxxxx("Hunyo so gapoan ya  klase., Class starts in June.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ames");
        loDetail.setPrnction("A-mes");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An act or process of immersing and washing one's body in a large container of water.");
        loDetail.setTransLte("Bath");
        loDetail.setInfoxxxx("Manames tayo ed dayat., Let's take a bath in the ocean.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Toktok");
        loDetail.setPrnction("Tok-tok");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A sudden short sound caused by a blow - especially on a door to attract attention or gain entry.");
        loDetail.setTransLte("Knock");
        loDetail.setInfoxxxx("Toktok ni bago Onloob, Knock first before entering.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Reserba");
        loDetail.setPrnction("Re-ser-ba");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A supply of a commodity not needed for immediate use but available if required.");
        loDetail.setTransLte("Reserve");
        loDetail.setInfoxxxx("Dakel so reserba mi ed basketbol., We have a lot of reserves in basketball.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Manalwar");
        loDetail.setPrnction("Ma-nal-war");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Making sure of avoiding potential danger - mishap - or harm; cautious.");
        loDetail.setTransLte("Careful");
        loDetail.setInfoxxxx("Manalwar ka ta lenag moy manmaneho., Be careful while you are driving.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Oras");
        loDetail.setPrnction("O-ras");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A point of time as measured in hours and minutes past midnight or noon.");
        loDetail.setTransLte("Time");
        loDetail.setInfoxxxx("Anto lay oras?, What time is it?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Say");
        loDetail.setPrnction("Say");
        loDetail.setWordType("Determiner");
        loDetail.setDescript("Belonging to or associated with a thing previously mentioned or easily identified.");
        loDetail.setTransLte("Its");
        loDetail.setInfoxxxx("Say tawag da et Basketbol., Its called Basketball.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Masakbay");
        loDetail.setPrnction("Ma-sak-bay");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Happening or done before the usual or expected time.");
        loDetail.setTransLte("Early");
        loDetail.setInfoxxxx("You should come early., Masakbay kan Onsabi a.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Atrasado");
        loDetail.setPrnction("A-tra-sa-do");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("After the expected - proper - or usual time.");
        loDetail.setTransLte("Late");
        loDetail.setInfoxxxx("Atrasado ka lan onsimpit?, Are you going home late?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Dia");
        loDetail.setPrnction("Dia");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("In - at - or to this place or position.");
        loDetail.setTransLte("Here");
        loDetail.setInfoxxxx("Galalad dia natan., Come here now.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Painawa");
        loDetail.setPrnction("Pa-i-na-wa");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An instance or period of relaxing or ceasing to engage in strenuous or stressful activity.");
        loDetail.setTransLte("Rest");
        loDetail.setInfoxxxx("Painawa tini., Let's rest first.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Natan");
        loDetail.setPrnction("Na-tan");
        loDetail.setWordType("Noun");
        loDetail.setDescript("This present day.");
        loDetail.setTransLte("Today");
        loDetail.setInfoxxxx("Natan ya agew et painawa, Today is a day of rest.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Karuman");
        loDetail.setPrnction("Ka-ru-man");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The day before today.");
        loDetail.setTransLte("Yesterday");
        loDetail.setInfoxxxx("Linma kami ed dayat karuman., Yesterday we went to the beach.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Nabuas");
        loDetail.setPrnction("Nab-uas");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The day after today.");
        loDetail.setTransLte("Tomorrow");
        loDetail.setInfoxxxx("Onalis sikato nabuas., He leaves tomorrow.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Onalis");
        loDetail.setPrnction("O-na-lis");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Go away from.");
        loDetail.setTransLte("Leave");
        loDetail.setInfoxxxx("Onalis siakto nabuas. He leaves tomorrow. ");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kab-uasan");
        loDetail.setPrnction("Kab-ua-san");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The part of the day which follows noon - between noon and evening.");
        loDetail.setTransLte("Morning");
        loDetail.setInfoxxxx("Kabuasan tayo onalis., We will leave in the morning.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ugto");
        loDetail.setPrnction("Ug-to");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The part of the day which follows noon - between noon and evening");
        loDetail.setTransLte("Afternoon");
        loDetail.setInfoxxxx("Ugto kala simabi., You arrived in the afternoon.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);


        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ngarem");
        loDetail.setPrnction("Nga-rem");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Twelve o'clock in the day; midday.");
        loDetail.setTransLte("Noon");
        loDetail.setInfoxxxx("Ngarem la., It's already noon.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Labi");
        loDetail.setPrnction("La-bi");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The period of time at the end of the day - usually from about 6 p.m. to bedtime.");
        loDetail.setTransLte("Evening");
        loDetail.setInfoxxxx("Masantos ya Labi., Good Evening.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Dayat");
        loDetail.setPrnction("Da-yat");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A very large expanse of sea - in particular each of the main areas into which the sea is divided geographically.");
        loDetail.setTransLte("Ocean");
        loDetail.setInfoxxxx("Man amis tayo ed dayat., Let's take a bath on the ocean.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Hulyo");
        loDetail.setPrnction("Hul-yo");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The seventh month of the year - in the northern hemisphere usually considered the second month of summer.");
        loDetail.setTransLte("July");
        loDetail.setInfoxxxx("Onsempit si kuyak no hulyo., My brother will come home in July.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Agosto");
        loDetail.setPrnction("A-gos-to");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The eighth month of the year - in the northern hemisphere usually considered the last month of summer.");
        loDetail.setTransLte("August");
        loDetail.setInfoxxxx("Makapaningnigan kami la ed Agosto., We will meet in August.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Setyembre");
        loDetail.setPrnction("Set-yem-bre");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The ninth month of the year - in the northern hemisphere usually considered the first month of autumn.");
        loDetail.setTransLte("September");
        loDetail.setInfoxxxx("Setyembre la nabwas., It's September tomorrow.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Simba");
        loDetail.setPrnction("Sim-ba");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A period of seven days.");
        loDetail.setTransLte("Week");
        loDetail.setInfoxxxx("Sakey simba kami labat diman., We were only there for a week.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Bulan");
        loDetail.setPrnction("Bu-lan");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Each of the twelve named periods into which a year is divided.");
        loDetail.setTransLte("Month");
        loDetail.setInfoxxxx("Pigaran bulan labat la agew na inkiyanak ko la., My birthday is just a few months away.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Oktubre");
        loDetail.setPrnction("Ok-tu-bre");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The tenth month of the year - in the northern hemisphere usually considered the second month of autumn.");
        loDetail.setTransLte("October");
        loDetail.setInfoxxxx("Say proyekto nan ompisa nin oktubre. The project started in october.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Taon");
        loDetail.setPrnction("Ta-on");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The time taken by the earth to make one revolution around the sun.");
        loDetail.setTransLte("Year");
        loDetail.setInfoxxxx("Maliket na balon taon., Happy New Year.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Balo");
        loDetail.setPrnction("Ba-lo");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Already existing but seen - experienced - or acquired recently or now for the first time.");
        loDetail.setTransLte("New");
        loDetail.setInfoxxxx("Walay balon sapatos ko., I have new shoes.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Nobyembre");
        loDetail.setPrnction("Nob-yem-bre");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The eleventh month of the year - in the northern hemisphere usually considered the last month of autumn.");
        loDetail.setTransLte("November");
        loDetail.setInfoxxxx("Nanlukas may lakoan nin nobyembre., The store opened in november.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Disyembre");
        loDetail.setPrnction("Dis-yem-bre");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The twelfth month of the year - in the northern hemisphere usually considered the first month of winter.");
        loDetail.setTransLte("December");
        loDetail.setInfoxxxx("Disyembre so selebrasyon na krismas., Christmas is celebrated in december.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Unona");
        loDetail.setPrnction("U-no-na");
        loDetail.setWordType("Number");
        loDetail.setDescript("Coming before all others in time or order; earliest; 1st.");
        loDetail.setTransLte("First");
        loDetail.setInfoxxxx("Sika so unona ya onalis., You are the first to leave.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Komadua");
        loDetail.setPrnction("Ko-ma-dua");
        loDetail.setWordType("Number");
        loDetail.setDescript("Constituting number two in a sequence; coming after the first in time or order; 2nd.");
        loDetail.setTransLte("Second");
        loDetail.setInfoxxxx("Sika so komadua ya onalis., You are the second to leave.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Komatlo");
        loDetail.setPrnction("Ko-mat-lo");
        loDetail.setWordType("Number");
        loDetail.setDescript("Constituting number three in a sequence; 3rd.");
        loDetail.setTransLte("Third");
        loDetail.setInfoxxxx("Inunor to so komatlon napampilian., He chose a third option.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Komapat");
        loDetail.setPrnction("Ko-ma-pat");
        loDetail.setWordType("Number");
        loDetail.setDescript("Constituting number four in a sequence; 4th.");
        loDetail.setTransLte("Fourth");
        loDetail.setInfoxxxx("Sika so komapat ya onalis., You are the Fourth to leave.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Komalima");
        loDetail.setPrnction("Ko-ma-li-ma");
        loDetail.setWordType("Number");
        loDetail.setDescript("Constituting number five in a sequence; 5th.");
        loDetail.setTransLte("Fifth");
        loDetail.setInfoxxxx("Asumpal siakto ya komalima., He finished fifth.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Komanem");
        loDetail.setPrnction("Ko-ma-nem");
        loDetail.setWordType("Number");
        loDetail.setDescript("Constituting number six in a sequence; 6th.");
        loDetail.setTransLte("Sixth");
        loDetail.setInfoxxxx("Komanem sikato ed san aagi., He is the sixth among siblings.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Komapito");
        loDetail.setPrnction("Ko-ma-pi-to");
        loDetail.setWordType("Number");
        loDetail.setDescript("Constituting number seven in a sequence; 7th.");
        loDetail.setTransLte("Seventh");
        loDetail.setInfoxxxx("Say komapiton gol to ed sayan taon., His seventh goal of the season.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Komawalo");
        loDetail.setPrnction("Komawalo");
        loDetail.setWordType("Number");
        loDetail.setDescript("Constituting number eight in a sequence; 8th.");
        loDetail.setTransLte("Eighth");
        loDetail.setInfoxxxx("Sikato so komawaloan ed saray analo., He is the eighth among the winners.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Komasiam");
        loDetail.setPrnction("Ko-ma-siam");
        loDetail.setWordType("Number");
        loDetail.setDescript("Constituting number nine in a sequence; 9th.");
        loDetail.setTransLte("Ninth");
        loDetail.setInfoxxxx("Sika so komasiam ed kompetisyon., You are ninth in the contest.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Komasamplo");
        loDetail.setPrnction("Ko-ma-sam-plo");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Constituting number ten in a sequence; 10th.");
        loDetail.setTransLte("Tenth");
        loDetail.setInfoxxxx("Komasamplo ka ed klase., You are tenth in class.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Sanlasos");
        loDetail.setPrnction("San-la-sos");
        loDetail.setWordType("Number");
        loDetail.setDescript("The number equivalent to the product of ten and ten; ten more than ninety; 100.");
        loDetail.setTransLte("Hundred");
        loDetail.setInfoxxxx("Say kuartak et sanlasos labat., My money is only a hundred.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Sanlibon");
        loDetail.setPrnction("San-li-bon");
        loDetail.setWordType("Number");
        loDetail.setDescript("The number equivalent to the product of a hundred and ten; 1000.");
        loDetail.setTransLte("Thousand");
        loDetail.setInfoxxxx("Nilibon totoo so inmatendi ed sayan okasyon., Thousands of people attended the event.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Milyon");
        loDetail.setPrnction("Mil-yon");
        loDetail.setWordType("Number");
        loDetail.setDescript("The number equivalent to the product of a thousand and a thousand; 1000000 or 106.");
        loDetail.setTransLte("Million");
        loDetail.setInfoxxxx("Sakey milyon a totoo so nagunggonaan., A million people will benefit.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Iner");
        loDetail.setPrnction("I-ner");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("In or to what place or position.");
        loDetail.setTransLte("Where");
        loDetail.setInfoxxxx("Iner so panaayaman mo?, Where do you live?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kabusol");
        loDetail.setPrnction("Ka-bu-sol");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Feel intense or passionate dislike for (someone).");
        loDetail.setTransLte("Hate");
        loDetail.setInfoxxxx("Kabusol ta ka., I hate you.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kapigan");
        loDetail.setPrnction("Ka-pi-gan");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("At what time.");
        loDetail.setTransLte("When");
        loDetail.setInfoxxxx("Kapigan so unor lan impakanengneng yo ed sikato?, When did you last see him?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Anto");
        loDetail.setPrnction("An-to");
        loDetail.setWordType("Pronoun");
        loDetail.setDescript("Asking for information specifying something.");
        loDetail.setTransLte("What");
        loDetail.setInfoxxxx("Anto so ngaran mo?, What is your name?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Pano");
        loDetail.setPrnction("Pa-no");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("In what way or manner; by what means.");
        loDetail.setTransLte("How");
        loDetail.setInfoxxxx("Panon itan ya nagagawa?, How does it work?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Akin");
        loDetail.setPrnction("A-kin");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("For what cause - reason - or purpose");
        loDetail.setTransLte("Why");
        loDetail.setInfoxxxx("Akin et ginawam itan?, Why did you do it?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Dinan");
        loDetail.setPrnction("Di-nan");
        loDetail.setWordType("Pronoun");
        loDetail.setDescript("Asking for information specifying one or more people or things from a definite set.");
        loDetail.setTransLte("Which");
        loDetail.setInfoxxxx("Dinan ed sikara?, Which of them?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ngaran");
        loDetail.setPrnction("Nga-ran");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A word or set of words by which a person - animal - place - or thing is known - addressed - or referred to.");
        loDetail.setTransLte("Name");
        loDetail.setInfoxxxx("Say ngaran ko et Parsons, John Parsons., My name is Parsons, John Parsons.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Nengnengen");
        loDetail.setPrnction("Neng-ne-ngen");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Perceive with the eyes; discern visually.");
        loDetail.setTransLte("See");
        loDetail.setInfoxxxx("Diad arawi et nanengneng toy asul a dayat., In the distance she could see the blue sea.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Tawag");
        loDetail.setPrnction("Ta-wag");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Cry out (a word or words).");
        loDetail.setTransLte("Call");
        loDetail.setInfoxxxx("Nadngel to so mapekder ya boses ya ontatawag ed ngaran to., He heard an insistent voice calling his name.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Gapo");
        loDetail.setPrnction("Ga-po");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Begin or be reckoned from a particular point in time or space.");
        loDetail.setTransLte("Start");
        loDetail.setInfoxxxx("Onggapo so lumba no Setyembre., The race starts in Setyembre.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kompetisyon");
        loDetail.setPrnction("Kom-pe-ti-syon");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An event in which people compete for supremacy in a sport - activity - or particular quality.");
        loDetail.setTransLte("Contest");
        loDetail.setInfoxxxx("Siopa so manalo ed kompetisyon na bisikleta?, Who will win in bike contest?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Bisikleta");
        loDetail.setPrnction("Bi-sik-le-ta");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A bicycle or motorcycle.");
        loDetail.setTransLte("Bike");
        loDetail.setInfoxxxx("Siopa so manalo ed kompetisyon na bisikleta?, Who will win in bike contest?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kabaliksan");
        loDetail.setPrnction("Ka-ba-lik-san");
        loDetail.setWordType("Noun");
        loDetail.setDescript("What is meant by a word - text - concept - or action.");
        loDetail.setTransLte("Meaning");
        loDetail.setInfoxxxx("WAnto so Talagan Kabaliksan na Satan?, hat Does It Really Mean?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Talosan");
        loDetail.setPrnction("Ta-lo-san");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Perceive the intended meaning of (words - a language - or a speaker).");
        loDetail.setTransLte("Understand");
        loDetail.setInfoxxxx("Agto atalosan so anggan sakey a salita ya imbagak., He didn't understand a word I said. ");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Proyekto");
        loDetail.setPrnction("Pro-yek-to");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An individual or collaborative enterprise that is carefully planned to achieve a particular aim.");
        loDetail.setTransLte("Project");
        loDetail.setInfoxxxx("Dakel so proyekto mi., We have a lot of project.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Gunggona");
        loDetail.setPrnction("Gung-go-na");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An advantage or profit gained from something.");
        loDetail.setTransLte("Benefit");
        loDetail.setInfoxxxx("Anto so nagunggona ed siak lapud piulop kod sika?, What is my benefit for being with you?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Sankaabigan");
        loDetail.setPrnction("San-ka-a-bi-gan");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Of the most excellent - effective - or desirable type or quality.");
        loDetail.setTransLte("Best");
        loDetail.setInfoxxxx("Say sankaabigan a pitcher ed liga., The best pitcher in the league.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Talaga");
        loDetail.setPrnction("Ta-la-ga");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("In actual fact - as opposed to what is said or imagined to be true or possible.");
        loDetail.setTransLte("Really");
        loDetail.setInfoxxxx("Antoy talagan agawa?, What really happened?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ketket");
        loDetail.setPrnction("Ket-ket");
        loDetail.setWordType("Verb");
        loDetail.setDescript("(of a person or animal) use the teeth to cut into or through something.");
        loDetail.setTransLte("Bite");
        loDetail.setInfoxxxx("Antoy talagan agawa?, What really happened?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Bulag");
        loDetail.setPrnction("Bu-lag");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Cause (someone) to be unable to see - permanently or temporarily.");
        loDetail.setTransLte("Blind");
        loDetail.setInfoxxxx("Sikatoy temporaryon abulag lapud sugat to., The injury temporarily blinded him.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Masaol");
        loDetail.setPrnction("Ma-sa-ol");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Act dishonestly or unfairly in order to gain an advantage - especially in a game or examination.");
        loDetail.setTransLte("Cheat");
        loDetail.setInfoxxxx("Mansasaol ka ed quiz tayo., You are cheating on our quiz.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Inkaugaw");
        loDetail.setPrnction("In-ka-u-gaw");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The state of being a child.");
        loDetail.setTransLte("Childhood");
        loDetail.setInfoxxxx("Say idealized a mundo na inkaugaw., The idealized world of childhood.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kugip");
        loDetail.setPrnction("Ku-gip");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A series of thoughts - images - and sensations occurring in a person's mind during sleep.");
        loDetail.setTransLte("Dream");
        loDetail.setInfoxxxx("Akupkugip taka., I had a dream about you.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ala");
        loDetail.setPrnction("A-la");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Remove (someone or something) from a particular place.");
        loDetail.setTransLte("Take");
        loDetail.setInfoxxxx("Inala to so sobre manlapud loob na bulsa to., He took an envelope from his inside pocket.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Dumaralos");
        loDetail.setPrnction("Du-ma-ra-los");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A person who owns or manages a farm.");
        loDetail.setTransLte("Farmer");
        loDetail.setInfoxxxx("Say tatay koy dumaralos., My father is a farmer.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Aral");
        loDetail.setPrnction("A-ral");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The devotion of time and attention to acquiring knowledge on an academic subject - especially by means of books.");
        loDetail.setTransLte("Study");
        loDetail.setInfoxxxx("Manaaral ak parad quiz tayo., I'm studying for our quiz.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Eskuelaan");
        loDetail.setPrnction("Es-kuela-an");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An institution for educating children.");
        loDetail.setTransLte("School");
        loDetail.setInfoxxxx("Onla ak la natan ed eskuelaan., I'm going to school now.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Bangon");
        loDetail.setPrnction("Ba-ngon");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Stop sleeping; wake from sleep.");
        loDetail.setTransLte("Awake");
        loDetail.setInfoxxxx("Sikatoy binmangon tan anengneng to a saray karsada et napnoy niebe., She awoke to find the streets covered in snow.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Dayo");
        loDetail.setPrnction("Da-yo");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A person born in or coming from a country other than one's own.");
        loDetail.setTransLte("Foreigner");
        loDetail.setInfoxxxx("Sikayo labat kasi so dayo dia?, Are you the only foreigners here?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ibaan");
        loDetail.setPrnction("I-ba-an");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Go somewhere with (someone) as a companion or escort.");
        loDetail.setTransLte("Accompany");
        loDetail.setInfoxxxx("Inibaan da ak., They accompanied me.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ibangat");
        loDetail.setPrnction("I-ba-ngat");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Show or explain to (someone) how to do something.");
        loDetail.setTransLte("Teach");
        loDetail.setInfoxxxx("Sikatoy angibangat ed sikato na panagbasa., She taught him to read.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Mangilalanor");
        loDetail.setPrnction("Ma-ngi-la-la-nor");
        loDetail.setWordType("Verb");
        loDetail.setDescript("(of a situation or event) include (something) as a necessary part or result.");
        loDetail.setTransLte("Involve");
        loDetail.setInfoxxxx("Say iyalis to ed sananey ya eskuelaan et mangilalanor na andukey a proseso na pan-assess., His transfer to another school would involve a lengthy assessment procedure.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Inom");
        loDetail.setPrnction("I-nom");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Take (a liquid) into the mouth and swallow.");
        loDetail.setTransLte("Drink");
        loDetail.setInfoxxxx("Inmirung kami ed abay na apoy tan inminom kami na kape., We sat by the fire and drinking our coffee.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Inkotkot");
        loDetail.setPrnction("In-kot-kot");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Put or hide under ground.");
        loDetail.setTransLte("Bury");
        loDetail.setInfoxxxx("Inkotkot to so kahon diad beneg a hardin., He buried the box in the back garden.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Luto");
        loDetail.setPrnction("Lu-to");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Prepare (food - a dish, or a meal) by combining and heating the ingredients in various ways., ");
        loDetail.setTransLte("Cook");
        loDetail.setInfoxxxx("Kasin manluto ak na pangdem ed sayan labi?, Shall I cook dinner tonight? ");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Aro");
        loDetail.setPrnction("A-ro");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An intense feeling of deep affection.");
        loDetail.setTransLte("Love");
        loDetail.setInfoxxxx("Saray ugugaw so mangiter ed atateng na liknaan na aro., Babies fill parents with feelings of love.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Inatey");
        loDetail.setPrnction("I-na-tey");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("No longer alive.");
        loDetail.setTransLte("Dead");
        loDetail.setInfoxxxx("Inatey may manok ko., My chicken died.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ipabayes");
        loDetail.setPrnction("I-pa-ba-yes");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Grant to (someone) the use of (something) on the understanding that it shall be returned.");
        loDetail.setTransLte("Lend");
        loDetail.setInfoxxxx("Kinerew nen Stewart ya ipabayes koy luluganan ko., Stewart asked me to lend him my car.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ipikasi");
        loDetail.setPrnction("I-pi-ka-si");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Address a solemn request or expression of thanks to a deity or other object of worship.");
        loDetail.setTransLte("Pray");
        loDetail.setInfoxxxx("Manpikasi kayo parad siak., Pray for me.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kaaro");
        loDetail.setPrnction("Ka-a-ro");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A person whom one knows and with whom one has a bond of mutual affection - typically exclusive of sexual or family relations.");
        loDetail.setTransLte("Friend");
        loDetail.setInfoxxxx("Sikatoy kaarok., She's a friend of mine.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Mangiras");
        loDetail.setPrnction("Ma-ngi-ras");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Unwilling to work or use energy.");
        loDetail.setTransLte("Lazy");
        loDetail.setInfoxxxx("Sikatoy mangiras a manluto., He was too lazy to cook.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Anisia");
        loDetail.setPrnction("A-ni-sia");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Accept (something) as true; feel sure of the truth of.");
        loDetail.setTransLte("Believe");
        loDetail.setInfoxxxx("Anisia so superintendent ed istorya nen Lancaster., The superintendent believed Lancaster's story.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Naksawan");
        loDetail.setPrnction("Nak-sa-wan");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("In need of sleep or rest; weary.");
        loDetail.setTransLte("Tired");
        loDetail.setInfoxxxx("Naknaksawan ak lan mantrabaho., I'm tired of working.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Matantan");
        loDetail.setPrnction("Ma-tan-tan");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Moving or operating, or designed to do so, only at a low speed; not quick or fast.");
        loDetail.setTransLte("Slow");
        loDetail.setInfoxxxx("Talagan matantan ka., You are so slow.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Sabaw");
        loDetail.setPrnction("Sa-baw");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A liquid dish - typically made by boiling meat - fish - or vegetables - etc. - in stock or water.");
        loDetail.setTransLte("Soup");
        loDetail.setInfoxxxx("Saray daluyon tan say danum ed paway et nagmaliw a makapal ya sopas. The waves and the water beyond have become a thick  soup.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Sibok");
        loDetail.setPrnction("Si-bok");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Expel air through pursed lips.");
        loDetail.setTransLte("Blow");
        loDetail.setInfoxxxx("Sibokan moy kandila., Blow the candle.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Uliten");
        loDetail.setPrnction("U-li-ten");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Do (something) again - either once or a number of times.");
        loDetail.setTransLte("Repeat");
        loDetail.setInfoxxxx("Ulit mo., Repeat it.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Sira");
        loDetail.setPrnction("Si-ra");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A limbless cold-blooded vertebrate animal with gills and fins and living wholly in water.");
        loDetail.setTransLte("Fish");
        loDetail.setInfoxxxx("Mangilako ak na sira., I sell fish.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Wala");
        loDetail.setPrnction("Wa-la");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Possess - own - or hold.");
        loDetail.setTransLte("Have");
        loDetail.setInfoxxxx("Walay sirak. I have fish.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Baleg");
        loDetail.setPrnction("Ba-leg");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Of considerable size - extent - or intensity.");
        loDetail.setTransLte("Big");
        loDetail.setInfoxxxx("Baleg itan a desisyon., It's a big decision.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Melag");
        loDetail.setPrnction("Me-lag");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Of a size that is less than normal or usual.");
        loDetail.setTransLte("Small");
        loDetail.setInfoxxxx("Melag tan mareen so kuarto., The room was small and quiet.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Maples");
        loDetail.setPrnction("Map-les");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Moving or capable of moving at high speed.");
        loDetail.setTransLte("Fast");
        loDetail.setInfoxxxx("Maples tan makapanyari ya kotse., A fast and powerful car.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Mareen");
        loDetail.setPrnction("Ma-re-en");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Making little or no noise.");
        loDetail.setTransLte("Quiet");
        loDetail.setInfoxxxx("Say luluganan et mareen., The car has a quiet.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Luluganan");
        loDetail.setPrnction("Lu-lu-ga-nan");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A thing used for transporting people or goods - especially on land - such as a car or truck.");
        loDetail.setTransLte("Vehicle");
        loDetail.setInfoxxxx("Walay luluganan ko., I have A vehicle.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Mura");
        loDetail.setPrnction("Mu-ra");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("(of an item for sale) low in price; worth more than its cost.");
        loDetail.setTransLte("Cheap");
        loDetail.setInfoxxxx("Angaliw ira na mamuran prutas., They bought some cheap fruit.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Mabli");
        loDetail.setPrnction("Mab-li");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Costing a lot of money.");
        loDetail.setTransLte("Expensive");
        loDetail.setInfoxxxx("Your clothes are expensive., Mabmabli iray kawes mo.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Asingger");
        loDetail.setPrnction("A-sing-ger");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("At or to a short distance away; nearby.");
        loDetail.setTransLte("Near");
        loDetail.setInfoxxxx("Asingger ak la., I'm near.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Arawi");
        loDetail.setPrnction("A-ra-wi");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("At - to - or by a great distance (used to indicate the extent to which one thing is distant from another).");
        loDetail.setTransLte("Far");
        loDetail.setInfoxxxx("Arawi so abung yo., Your house is very far away.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ampetang");
        loDetail.setPrnction("Am-pe-tang");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Having a high degree of heat or a high temperature.");
        loDetail.setTransLte("Hot");
        loDetail.setInfoxxxx("Komon ta ampetang ka., I wish you were hot.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ambetel");
        loDetail.setPrnction("Am-be-tel");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Of or at a low or relatively low temperature - especially when compared with the human body.");
        loDetail.setTransLte("Cold");
        loDetail.setInfoxxxx("Komon ta ambetel ka., I wish you were cold.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Napno");
        loDetail.setPrnction("Nap-no");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Containing or holding as much or as many as possible; having no empty space.");
        loDetail.setTransLte("Full");
        loDetail.setInfoxxxx("Saray basuraan a napno na basura., Wastebaskets full of rubbish.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Anggapo");
        loDetail.setPrnction("Ang-ga-po");
        loDetail.setWordType("Pronoun");
        loDetail.setDescript("Not anything; no single thing.");
        loDetail.setTransLte("Nothing");
        loDetail.setInfoxxxx("Anggapoy imbagak., I said nothing.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Mainomay");
        loDetail.setPrnction("Ma-i-no-may");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Achieved without great effort; presenting few difficulties.");
        loDetail.setTransLte("Easy");
        loDetail.setInfoxxxx("Mainomay so quiz., The quiz is easy.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Mairap");
        loDetail.setPrnction("Ma-i-rap");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Needing much effort or skill to accomplish - deal with - or understand.");
        loDetail.setTransLte("Difficult, Hard");
        loDetail.setInfoxxxx("Mairap so quiz., The quiz is so difficult.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Belat");
        loDetail.setPrnction("Be-lat");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Of great weight; difficult to lift or move.");
        loDetail.setTransLte("Heavy");
        loDetail.setInfoxxxx("Mabelat so pan ya awiten ko., The pan was too heavy for me to carry.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Alemew");
        loDetail.setPrnction("A-le-mew");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("(physics, chemistry) not having atomic weight greater than average.");
        loDetail.setTransLte("Light");
        loDetail.setInfoxxxx("Alemew labat ya bag so aawiten ko., I carry only a very light magazine bag.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Awiten");
        loDetail.setPrnction("A-wi-ten");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Support and move (someone or something) from one place to another.");
        loDetail.setTransLte("Carry");
        loDetail.setInfoxxxx("Mabelat so pan ya awiten ko., The pan was too heavy for me to carry.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Makapanyari");
        loDetail.setPrnction("Ma-ka-pan-ya-ri");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Having control and influence over people and events.");
        loDetail.setTransLte("Powerful");
        loDetail.setInfoxxxx("Sankamakapanyarin bansa ed mundo., The world's most powerful nation.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Mauges");
        loDetail.setPrnction("Ma-u-ges");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Of poor quality or a low standard.");
        loDetail.setTransLte("Bad");
        loDetail.setInfoxxxx("Mauges tan ed sika., It's bad for you.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Maong");
        loDetail.setPrnction("Ma-ong");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("To be desired or approved of.");
        loDetail.setTransLte("Good");
        loDetail.setInfoxxxx("Maong a kalidad na bilay., A good quality of life.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Tulong");
        loDetail.setPrnction("Tu-long");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The action of helping someone to do something; assistance.");
        loDetail.setTransLte("Help");
        loDetail.setInfoxxxx("Tinulongan da., They helped her.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ugaw");
        loDetail.setPrnction("U-gaw");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Having lived or existed for only a short time");
        loDetail.setTransLte("Young");
        loDetail.setInfoxxxx("Talagan marunong so ugaw a bii., The young girl is very smart.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Masiken");
        loDetail.setPrnction("Ma-si-ken");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Having lived for a long time; no longer young.");
        loDetail.setTransLte("Old");
        loDetail.setInfoxxxx("Masiken la ray atateng ko., My parents are old.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

    }

    public List<EDictionaryWords> GetWordsList(){
        return poList;
    }

    public List<ETrivia> GetTriviaList(){
        List<ETrivia> loList = new ArrayList<>();

        loTrivia = new ETrivia();
        loTrivia.setWordName("PANGASINAN");
        loTrivia.setImgLinkx("https://www.discoverthephilippines.com/wp-content/uploads/2021/08/article-cover-photo-pangasinan-guide.jpg");
        loTrivia.setInfoxxxx("Pangasinans name was derived from the word “asin”. Pangasinan was the largest producer of salt in the Philippines, but it was during the Spanish occupation when people called the place, “pang-asinan” or a place of salt-making. One salt farm called the Pacific Farm, can produce 30 million of kilos of salt annually. Pangasinan is the largest province in Ilocos Region, as well as located at the border of the region at its south. It comprises of 4 cities and 44 towns");
        loList.add(loTrivia);

        loTrivia = new ETrivia();
        loTrivia.setWordName("SUNFLOWER MAZE");
        loTrivia.setImgLinkx("https://outoftownblog.com/wp-content/uploads/2017/02/Sunflower-Farm-Maze-in-Layug-Pangasinan-photo-by-Allied-Botanical-Corp-Facebook.jpg");
        loTrivia.setInfoxxxx("The first sunflower maze in the Philippines is in Pangasinan. This sunflower farm is called Allied Botanical Corporation, can be found in Barangay Lichauco in Tayug, the eastern part of the province.");
        loList.add(loTrivia);

        loTrivia = new ETrivia();
        loTrivia.setWordName("HUNDRED ISLAND NATIONAL PARK");
        loTrivia.setImgLinkx("https://ilovepangasinan.com/wp-content/uploads/2016/12/I-Love-Front-Picture-Hundred-Islands.jpg");
        loTrivia.setInfoxxxx("Hundred Islands National Park Alaminos Pangasinan has more than 100 islands for you to enjoy, 124 to be exact during low tide and 123 during high tide. It is officially declared by President Manuel Quezon as a national park in 1940.  Tourist  can dip at the beautiful beaches and see amazing nature spots. Its home to places that are perfect for recreational activities—from swimming and trekking to sightseeing.Its known across the world for good reason—scattered beautifully upon the blue-green waters of the Lingayen Gulf, with abundant inland and underwater flora and fauna, cream-colored fine sand that yields to every step, and friendly local islanders.");
        loList.add(loTrivia);

        loTrivia = new ETrivia();
        loTrivia.setWordName("FIRST TRAIN OUTSIDE MANILA");
        loTrivia.setImgLinkx("https://upload.wikimedia.org/wikipedia/commons/thumb/6/67/PNR17-Dagupan.jpg/640px-PNR17-Dagupan.jpg");
        loTrivia.setInfoxxxx("The railway officially opened on November 24, 1892. Its route is from Dagupan City to Tutuban in Manila. The railway is no longer functioning, but anybody can still see its remains in Tutuban.");
        loList.add(loTrivia);

        loTrivia = new ETrivia();
        loTrivia.setWordName("PHILIPPINE NATIONAL ANTHEM");
        loTrivia.setImgLinkx("https://coconuts.co/wp-content/uploads/2018/09/20150612-flag-luneta-bs-950x540.jpg");
        loTrivia.setInfoxxxx("The Philippine National Anthem lyrics was in written in Pangasinan. The lyrics was originally a poem, entitled, “Filipinas” was written in Spanish by Jose Palma in Bautista, Pangasinan. The music was also originally a march song commissioned by the first president of the Republic of the Philippines, General Emilio Aguinaldo.");
        loList.add(loTrivia);

        loTrivia = new ETrivia();
        loTrivia.setWordName("BUGALLON");
        loTrivia.setImgLinkx("https://3.bp.blogspot.com/_qlZRMA0BnbY/TUHwvz5D3aI/AAAAAAAAGGo/YSgOvdEgrBQ/w1200-h630-p-k-no-nu/4053406072_f14e79cd12_z.jpg");
        loTrivia.setInfoxxxx("Bugallon was named after the hero from the town, and one of the provinces hero as well, Jose Torres Bugallon. In fact, a road in Lingayen was named after him. The town was known for agriculture by which the main statue in their plaza is a huge carabao.");
        loList.add(loTrivia);

        loTrivia = new ETrivia();
        loTrivia.setWordName("MAPANDAN");
        loTrivia.setImgLinkx("https://justforfun868929716.files.wordpress.com/2018/09/26874919-e1537515055286.jpg?w=594&h=350");
        loTrivia.setInfoxxxx("Mapandan is in fact a part of Mangaldan town then, and went independent as a town. Its name is even similar to the latter, but it was really derived from pandan, a plant/herb used as a flavoring or aroma in cooking.");
        loList.add(loTrivia);

        loTrivia = new ETrivia();
        loTrivia.setWordName("PRINCESS URDUJA");
        loTrivia.setImgLinkx("http://1.bp.blogspot.com/-nGyUPCyn8-U/U0A6lopQWlI/AAAAAAAADa8/XtiOG7vSULA/s1600/Princess+Urduja.jpg");
        loTrivia.setInfoxxxx("Princess of Pangasinan. A warrior queen of a matriarchal dynasty, Urduja was a 14th century ruler of Tawalisi, in what is now known as Pangasinan. Princess Urduja was trained in the art of war since she was a child, and became an expert in using the kampilan and a skilled navigator. Known far and wide, she was famous for leading a retinue of women warriors who were skilled fighters, equestrians, and experts in weaponry. With bodies of strength and muscular physique, they were known as Kinalakian, or Amazons. The legend of Princess Urduja can be attributed to the story of when she met the greatest traveler in history, Ibn Battuta.");
        loList.add(loTrivia);

        loTrivia = new ETrivia();
        loTrivia.setWordName("DAGUPAN CITY");
        loTrivia.setImgLinkx("https://i0.wp.com/peoplaid.com/wp-content/uploads/2019/03/Dagupan-City-Welcome-Arch.jpg?fit=632%2C465&ssl=1");
        loTrivia.setInfoxxxx("Home of the tastiest milkfish in the world. Dagupan City was originally named Bacnotan by the Augustinian missionaries a few years after the establishment of the Spanish encomienda in Pangasinan in 1583.  In 1660, Andres Malong, a local chieftain, led a revolt against the Spaniards for imposing forced labor.  After the revolt, the people rebuilt the town. To commemorate the gathering forces under Malong, the place was renamed to “Nandaragupan” which means “where people meet”.  In 1780, the name of the town was simplified to Dagupan, followed by the end of Spanish rule in July 23, 1898 when the Spanish troops surrendered to the Katipunan leader, General Francisco Makabulos.");
        loList.add(loTrivia);

        loTrivia = new ETrivia();
        loTrivia.setWordName("CALASIAO");
        loTrivia.setImgLinkx("https://live.staticflickr.com/3161/3349916963_3fc42c7690_b.jpg");
        loTrivia.setInfoxxxx("Known as the “Home of the famous and tasty rice cake. The Municipality of Calasiao is the second oldest town in the Province of Pangasinan.  It was founded by the Dominicans in the year 1588.  CALASIAO is derived from the root word “LASI” which means a place of lightning. Calasiao is where one can find the pilgrim site of the Señor Divino Tesoro and the only NCCA acknowledged cultural treasure in Pangasinan, the Sts. Peter & Paul Parish Church. It is also the home of the famous and tasty Calasiao Puto, it is a type of rice cake (puto) that is made out of fermented rice flour and shaped in bite-size portions.");
        loList.add(loTrivia);

        loTrivia = new ETrivia();
        loTrivia.setWordName("LINGAYEN");
        loTrivia.setImgLinkx("https://i0.wp.com/www.themermaidtravels.com/wp-content/uploads/2014/05/1-DSC_0137.jpg?fit=1600%2C1059&ssl=1");
        loTrivia.setInfoxxxx("The heart, the soul, and the face” of the Province of Pangasinan.The municipality got its name from a certain corpulent tamarind tree that grew at the present town plaza.  The tree was exceptionally big, tall and spreading that the surrounding trees were just dwarfs in comparison.  Passersby developed the habit of looking back and back again at this corpulent tree until it would vanish from their view.  When they arrived home and were asked what way they took in return, they would simply say through Lingayen meaning “looking back”.  Since then up to the present time, the town bears its name as “LINGAYEN”. It is also known as the home of the most delectable bagoong.  The theory of some makers is that the salinity of the air is a factor why fish fermenting is very ideal in Lingayen.");
        loList.add(loTrivia);

        loTrivia = new ETrivia();
        loTrivia.setWordName("MANAOAG");
        loTrivia.setImgLinkx("https://images.squarespace-cdn.com/content/v1/54889a49e4b0a429df687e67/1606159518413-PXZ09TPZJOMFLR2QP8VQ/IMG_5065.jpeg?format=2500w");
        loTrivia.setInfoxxxx("Manaoag began as a small settlement of Cawili, now the town of San Jacinto, by the banks of Baloquing Creek in the early 1600’s.  Some years later, the Augustinian Fathers established a Christian Mission which was originated and regarded as the Mission of Sta. Monica.  Being devout of the Blessed Virgin Mary, the Dominican Fathers who succeeded the Augustinians placed the settlements under the mantle of protection of the “Queen of the Most Holy Rosary.");
        loList.add(loTrivia);

        return loList;
    }
}

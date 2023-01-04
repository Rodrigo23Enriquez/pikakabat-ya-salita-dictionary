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
        loDetail = new EDictionaryWords();
        loDetail.setWordName("Aalaen");
        loDetail.setPrnction("A-a-la-en");
        loDetail.setWordType("Adjectives");
        loDetail.setDescript("Retrieval, Collective");
        loDetail.setTransLte("Taken, Collective");
        loDetail.setInfoxxxx("Aalaen mo may salming ko, You are taking my glasses");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Aaralen");
        loDetail.setPrnction("A-a-ra-len");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Subject to be studied");
        loDetail.setTransLte("Studying");
        loDetail.setInfoxxxx("dakel ya aaralen kon sabdyik, I have a lot of subjects to be studied");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Abong-Aralan");
        loDetail.setPrnction("A-bong-A-ra-lan");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An institution for educating.");
        loDetail.setTransLte("School");
        loDetail.setInfoxxxx("Baleg may abong-aralan, The school building is too big");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Bangon");
        loDetail.setPrnction("Ba-ngon");
        loDetail.setWordType("Verb");
        loDetail.setDescript("An instance of a person waking up or being woken up.");
        loDetail.setTransLte("Wake Up");
        loDetail.setInfoxxxx("Bangon kay masapbay nu kabwasan, You have to wake up early in the morning");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Dalanan");
        loDetail.setPrnction("Da-la-nan");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A narrow way, typically having walls on either side, allowing access between buildings or to different rooms within a building; a passageway.");
        loDetail.setTransLte("Passage, Pathway");
        loDetail.setInfoxxxx("Mangiter kimet ya dalanan mi, Give us a pathway");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Dayo");
        loDetail.setPrnction("Da-yo");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A person who moves from one place to another");
        loDetail.setTransLte("Migrant, Visitor");
        loDetail.setInfoxxxx("Dakel ya dayo jad barangay mi, We have a lot of visitors in our barangay");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Dengel");
        loDetail.setPrnction("De-ngel");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Give ones attention to a sound.");
        loDetail.setTransLte("Hear, Listen");
        loDetail.setInfoxxxx("Dengel moy ibabaga ya pusom, Listen to what your heart is saying");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Derew");
        loDetail.setPrnction("De-rew");
        loDetail.setWordType("Verb");
        loDetail.setDescript("An act or instance of handing something over.");
        loDetail.setTransLte("Handover, Give");
        loDetail.setInfoxxxx("Iderew mo ya ed sikato, Give this to him/her");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Diman");
        loDetail.setPrnction("Di-man");
        loDetail.setWordType("Adverb");
        loDetail.setDescript("In, at, or to that place or position.");
        loDetail.setTransLte("Over There, There");
        loDetail.setInfoxxxx("Diman so departamento ya IT, Over there is the IT department");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Duara");
        loDetail.setPrnction("Du-a-ra");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Two people, or things");
        loDetail.setTransLte("Two");
        loDetail.setInfoxxxx("Duara ya piraso ya papel, Two pieces of paper");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Dukduk");
        loDetail.setPrnction("Duk-duk");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Take hold of and lift or move someone or something.");
        loDetail.setTransLte("Pick Up");
        loDetail.setInfoxxxx("Dukduk mo pa tay naplag ko, Kindly pick up the thing that I dropped");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Dumaralos");
        loDetail.setPrnction("Du-ma-ra-los");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A person who owns or manages a farm.");
        loDetail.setTransLte("Fieldhand, Farmer");
        loDetail.setInfoxxxx("Dumaralos so amak, My father is a fieldhand");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ebat");
        loDetail.setPrnction("E-bat");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Say something in response to something someone has said.");
        loDetail.setTransLte("Reply, Answer");
        loDetail.setInfoxxxx("Ebatan mo pay tawag ko, Answer my call");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ekalen");
        loDetail.setPrnction("E-ka-len");
        loDetail.setWordType("Verb");
        loDetail.setDescript("        Take (something) away or off from the position occupied");
        loDetail.setTransLte("Remove");
        loDetail.setInfoxxxx("Ekalen ko may insabit mo ya kawes, I will remove the clothes that you hung");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Erep");
        loDetail.setPrnction("E-re-p");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Stop the operation or flow of something by means of a valve, switch, or button.");
        loDetail.setTransLte("Turn Off");
        loDetail.setInfoxxxx("Erep mo tay radyo, Turn off the radio");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Galaw");
        loDetail.setPrnction("Ga-law");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An act of changing physical location or position or of having this changed.");
        loDetail.setTransLte("Movement, Action");
        loDetail.setInfoxxxx("Babantayan ko so galaw mo, I am watching your actions");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Garita");
        loDetail.setPrnction("Ga-ri-ta");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A small store selling groceries and a limited range of household goods in a mainly residential area.");
        loDetail.setTransLte("Corner Store, Sari-Sari Store");
        loDetail.setInfoxxxx("Angaliw ak ya gatas ed garita,I bought a  milk at the corner store");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Gastador");
        loDetail.setPrnction("Gas-ta-dor");
        loDetail.setWordType("Adjectives");
        loDetail.setDescript("Recklessly extravagant or wasteful in the use of resources.");
        loDetail.setTransLte("Profligate, Waster");
        loDetail.setInfoxxxx("Gastador tan ya ugaw, That child is a waster");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Gawat");
        loDetail.setPrnction("Ga-wat");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A time of hardship. Stretch out an arm in a specified direction in order to touch or grasp something.");
        loDetail.setTransLte("Scarcity,Starvation,Reach");
        loDetail.setInfoxxxx("Agkogabay ya nalikna so gawat ed siyak, I dont want to feel starvation");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Hueteng");
        loDetail.setPrnction("Hu-e-teng");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An illegal numbers game similar to lotto");
        loDetail.setTransLte("Jueteng");
        loDetail.setInfoxxxx("Iligal so hueteng, Jueteng is illegal");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ibaan");
        loDetail.setPrnction("I-ba-an");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Go somewhere with (someone) as a companion or escort.");
        loDetail.setTransLte("Accompany, Escort");
        loDetail.setInfoxxxx("Inibaan ya ama to, Her father escorted her");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ibales");
        loDetail.setPrnction("I-ba-les");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Cause a liquid to flow from a container into a cup or other vessel.");
        loDetail.setTransLte("Pour Out");
        loDetail.setInfoxxxx("Ibales mo may danom, Pour out the water into the container");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ibangat");
        loDetail.setPrnction("I-ba-ngat");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Show or explain to (someone) how to do something.");
        loDetail.setTransLte("Teac");
        loDetail.setInfoxxxx("Ibangat mon mansulat, Teach her how to write");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ibulos");
        loDetail.setPrnction("I-bu-los");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Allow or enable to escape from confinement; set free.");
        loDetail.setTransLte("Release");
        loDetail.setInfoxxxx("Ibulos mo may aso, Release the dog");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Idamay");
        loDetail.setPrnction("I-da-may");
        loDetail.setWordType("Verb");
        loDetail.setDescript("(of a situation or event) include (something) as a necessary part or result.");
        loDetail.setTransLte("Involve");
        loDetail.setInfoxxxx("Idamay ta ka, I will involve you");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Inom");
        loDetail.setPrnction("I-nom");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Take (a liquid) into the mouth and swallow.");
        loDetail.setTransLte("Drink");
        loDetail.setInfoxxxx("Labay moy uninom?, Do you want to drink?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ikutkut");
        loDetail.setPrnction("I-kut-kut");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Put or hide under ground.");
        loDetail.setTransLte("Bury");
        loDetail.setInfoxxxx("Ikutkut mo tay inatey ya manok, Bury the dead chicken");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ilako");
        loDetail.setPrnction("I-la-ko");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Give or hand over (something) in exchange for money.");
        loDetail.setTransLte("Sell");
        loDetail.setInfoxxxx("Sarag mo lan ilako tay kotsim natan, You can sell your car now");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Iluto");
        loDetail.setPrnction("I-lu-to");
        loDetail.setWordType("Verb");
        loDetail.setDescript("        Prepare (food, a dish, or a meal) by combining and heating the ingredients in various ways.");
        loDetail.setTransLte("Cook");
        loDetail.setInfoxxxx("Ilutom ta lamay manok,Lets cook the chicken");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Inalig");
        loDetail.setPrnction("I-na-lig");
        loDetail.setWordType("Adjectives");
        loDetail.setDescript("Make a similar or identical version of; reproduce.");
        loDetail.setTransLte("Copied, Mimicked");
        loDetail.setInfoxxxx("Inalig toy sagot ko, He copied my answer");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Inaro");
        loDetail.setPrnction("I-na-ro");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An intense feeling of deep affection.");
        loDetail.setTransLte("Inaro");
        loDetail.setInfoxxxx("Inaro ta ka, I love you");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Inatey");
        loDetail.setPrnction("I-na-tey");
        loDetail.setWordType("Noun");
        loDetail.setDescript("No longer alive.");
        loDetail.setTransLte("Inatey");
        loDetail.setInfoxxxx("Inaatey ya manok, Dead chickens");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ipakerew");
        loDetail.setPrnction("I-pa-ke-rew");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Give something freely as a gift or donation.");
        loDetail.setTransLte("Give Away");
        loDetail.setInfoxxxx("Ipakerew mo met la tay daan ya sapatos mo, Give away your old shoes");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ipaotang");
        loDetail.setPrnction("I-pa-o-tang");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Grant to (someone) the use of (something) on the understanding that it shall be returned.");
        loDetail.setTransLte("Lend");
        loDetail.setInfoxxxx("Ipaotang mod xiak so kwartam, Lend me your money");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ipikasi");
        loDetail.setPrnction("I-pi-ka-si");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Address a solemn request or expression of thanks to a deity or other object of worship.");
        loDetail.setTransLte("Pray");
        loDetail.setInfoxxxx("Ipikasim ak, Pray for me");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Ituro");
        loDetail.setPrnction("I-tu-ro");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Direct someones gaze or attention toward, especially by extending ones finger.");
        loDetail.setTransLte("Point Out");
        loDetail.setInfoxxxx("Pinapaway ya pupulis iray totoo piyan naituro to so suspek, A policeman asked people to go out so that he could point out the suspect");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kaabay");
        loDetail.setPrnction("Ka-a-bay");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A person living near or next door to the speaker or person referred to.");
        loDetail.setTransLte("Neighbor");
        loDetail.setInfoxxxx("So sakey a testigo a palsoy ibabaga to sumpad kaabay to, Is a man bearing false witness against his neighbor");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kaagewan");
        loDetail.setPrnction("Ka-a-ge-wan");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A person whom one knows and with whom one has a bond of mutual affection, typically exclusive of sexual or family relations.");
        loDetail.setTransLte("Noon, Sunshine");
        loDetail.setInfoxxxx("Kaagewan ka met lan mantrabaho, You are working at noon");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kaaro");
        loDetail.setPrnction("Ka-a-ro");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A person whom one knows and with whom one has a bond of mutual affection, typically exclusive of sexual or family relations.");
        loDetail.setTransLte("Friend");
        loDetail.setInfoxxxx("Kaaro yan too, This man is my fiend");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kabat");
        loDetail.setPrnction("Ka-bat");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Have developed a relationship with (someone) through meeting and spending time with them; be familiar or friendly with.");
        loDetail.setTransLte("Know");
        loDetail.setInfoxxxx("Ikdan ta kay mapagalang a ngaran, anggaman agmo ak kabat, I am giving you a name of honor, although you did not know me.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Kakiewan");
        loDetail.setPrnction("Ka-ki-e-wan");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A large area covered chiefly with trees and undergrowth.");
        loDetail.setTransLte("Forest");
        loDetail.setInfoxxxx("Saray palandey tan lawak ed abalaten na Haiti so asakbongan na mabubunan kakiewan na tropiko, Mountains and valleys in the south of Haiti are covered with lush tropical forest.");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Labi");
        loDetail.setPrnction("La-bi");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The period of darkness in each twenty-four hours; the time from sunset to sunrise.");
        loDetail.setTransLte("Evening, Night");
        loDetail.setInfoxxxx("Labi la sempet kalad abong, Its already evening; go home");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Mangiras");
        loDetail.setPrnction("Ma-ngi-ras");
        loDetail.setWordType("Adjectives");
        loDetail.setDescript("Unwilling to work or use energy.");
        loDetail.setTransLte("Lazy");
        loDetail.setInfoxxxx("Mangiras ka, You are lazy");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Manisia");
        loDetail.setPrnction("Ma-ni-sia");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Accept (something) as true; feel sure of the truth of.");
        loDetail.setTransLte("Believe");
        loDetail.setInfoxxxx("Manisia ka ed siak, Believe in me");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Naksawan");
        loDetail.setPrnction("Nak-sa-wan");
        loDetail.setWordType("Adjectives");
        loDetail.setDescript("In need of sleep or rest; weary.");
        loDetail.setTransLte("Tried");
        loDetail.setInfoxxxx("Naksawan akla, Im tired");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Sabaw");
        loDetail.setPrnction("Sa-baw");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A liquid dish, typically made by boiling meat, fish, or vegetables, etc., in stock or water.");
        loDetail.setTransLte("Soup");
        loDetail.setInfoxxxx("Labay moy sabaw?, You want soup?");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Sibok");
        loDetail.setPrnction("Si-bok");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Expel air through pursed lips.");
        loDetail.setTransLte("Blow");
        loDetail.setInfoxxxx("Sakey a sibok labat so mangipalir ed saratan, A mere breath will blow them away");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Supsup");
        loDetail.setPrnction("Sup-sup");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Draw into the mouth by contracting the muscles of the lip and mouth to make a partial vacuum");
        loDetail.setTransLte("Suck");
        loDetail.setInfoxxxx("Supsup mon maong,Suck it well");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Uliten");
        loDetail.setPrnction("U-li-ten");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Say or do it again");
        loDetail.setTransLte("Repeat");
        loDetail.setInfoxxxx("Uliten may kansiyon, Repeat the song");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Yatol");
        loDetail.setPrnction("Ya-tol");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Have or retain possession of.");
        loDetail.setTransLte("Keep");
        loDetail.setInfoxxxx("Yatol mo pa yay kwartak, Kindly keep my money");
        loDetail.setDctnryTp(0);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Taking");
        loDetail.setPrnction("Tak-ing");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Retrieval,  Collective");
        loDetail.setTransLte("Bawien,  Alaen");
        loDetail.setInfoxxxx("You are taking my glasses, Aalaen mo may salming ko");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Studying");
        loDetail.setPrnction("Stud-ying");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Subject to be studied");
        loDetail.setTransLte("Aaralen");
        loDetail.setInfoxxxx("I have a lot of subjects to be studied, Dakel ya aaralen kon sabdyik");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("School Building");
        loDetail.setPrnction("S-chool-Buil-ding");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An institution for educating");
        loDetail.setTransLte("Abong-Aralan");
        loDetail.setInfoxxxx("Manaral tayo ed abong-aralan, Lets study in school building");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Wake-up");
        loDetail.setPrnction("Wake-up");
        loDetail.setWordType("Verb");
        loDetail.setDescript("An instance of a person waking up or being woken up");
        loDetail.setTransLte("Bangon");
        loDetail.setInfoxxxx("You have to wake up early in the morning, Bangon kay masapbay no kabwasan");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Pathway");
        loDetail.setPrnction("Path-way");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A narrow way, typically having walls on either side, allowing access between buildings or to different rooms within a building; a passageway.");
        loDetail.setTransLte("Dalanan");
        loDetail.setInfoxxxx("Mangiter kimet ya dalanan mi, Give us a pathway");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Visitor");
        loDetail.setPrnction("Vi-si-tor");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A person who moves from one place to another");
        loDetail.setTransLte("Dayo");
        loDetail.setInfoxxxx("We have alot of visitor in our barangay, Dakel ya dayo jad barangay mi");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Listen");
        loDetail.setPrnction("Lis-ten");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Give ones attention to a sound.");
        loDetail.setTransLte("Dengel");
        loDetail.setInfoxxxx("Listen to what my heart is saying, Dengel moy ibabaga ya pusom");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Give");
        loDetail.setPrnction("Give");
        loDetail.setWordType("Verb");
        loDetail.setDescript("An act or instance of handing something over.");
        loDetail.setTransLte("Ikdan");
        loDetail.setInfoxxxx("Give her blanket, Ikdan moy oles");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Over there");
        loDetail.setPrnction("O-ver-there");
        loDetail.setWordType("Verb");
        loDetail.setDescript("In, at, or to that place or position.");
        loDetail.setTransLte("Diman");
        loDetail.setInfoxxxx("Over there is the I.T department, Diman so departamento ya I.T");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Two");
        loDetail.setPrnction("Two");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Two people, or things");
        loDetail.setTransLte("Duara");
        loDetail.setInfoxxxx("Two pieces of paper, Duaran piraso ya papel");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Pick up");
        loDetail.setPrnction("Pick-up");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Take hold of and lift or move someone or something.");
        loDetail.setTransLte("Dukduk");
        loDetail.setInfoxxxx("Kindly pick up the thing that i drop, Dukduk mo pa tay naplag ko");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Fieldhand");
        loDetail.setPrnction("Field-hand");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A person who owns or manages a farm.");
        loDetail.setTransLte("Dumaralos");
        loDetail.setInfoxxxx("My father is a fieldhand, Dumaralos so amak");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Reply");
        loDetail.setPrnction("Rep-ly");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Say something in response to something someone has said.");
        loDetail.setTransLte("Ebat");
        loDetail.setInfoxxxx("Reply on my message, Ebatan mo so mensahek");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Eject");
        loDetail.setPrnction("E-ject");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Take (something) away or off from the position occupied");
        loDetail.setTransLte("Bagut");
        loDetail.setInfoxxxx("Eject the wire, Pagiten mo may kable");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Turn off");
        loDetail.setPrnction("Turn-off");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Stop the operation or flow of something by means of a valve, switch, or button.");
        loDetail.setTransLte("Erep");
        loDetail.setInfoxxxx("Turn off the light, Erep mo may silew");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Motion");
        loDetail.setPrnction("Mo-tion");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An act of changing physical location or position or of having this changed.");
        loDetail.setTransLte("Kiwas, Galaw");
        loDetail.setInfoxxxx("Walking is a motion, Say panag akar et sakey ya galaw");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Sari-sari Store");
        loDetail.setPrnction("Sa-ri-sa-ri-s-tore");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A small store selling groceries and a limited range of household goods in a mainly residential area.");
        loDetail.setTransLte("Garita");
        loDetail.setInfoxxxx("Buy foods in the sari-sari store, Mangaliw kay naakan dia ed");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Waster");
        loDetail.setPrnction("Was-ter");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Recklessly extravagant or wasteful in the use of resources.");
        loDetail.setTransLte("Gastador");
        loDetail.setInfoxxxx("He is rich that's why he is a waster, Mayaman katon gastador");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Scarcity");
        loDetail.setPrnction("S-car-ci-ty");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A time of hardship.");
        loDetail.setTransLte("Gawat, Iyarap");
        loDetail.setInfoxxxx("It is time of scarcity, Agew kasi ya gawat");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Hueteng");
        loDetail.setPrnction("Hu-e-teng");
        loDetail.setWordType("Noun");
        loDetail.setDescript("An illegal numbers game similar to lotto");
        loDetail.setTransLte("Jueteng");
        loDetail.setInfoxxxx("Avoid playing jueteng, Iyagel so pangalaw ya huesteng");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Escort");
        loDetail.setPrnction("Es-cort");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Go somewhere with (someone) as a companion or escort.");
        loDetail.setTransLte("Ibaan, Ipaatnubang");
        loDetail.setInfoxxxx("Escort the visitor, Itulor mo imay bisita");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Pour");
        loDetail.setPrnction("Pour");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Cause a liquid to flow from a container into a cup or other vessel.");
        loDetail.setTransLte("Ibales, Kalboan, Balesan");
        loDetail.setInfoxxxx("Pour the water in the container, Ibales mo may danom ta kargaan");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Teach");
        loDetail.setPrnction("Teach");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Show or explain to (someone) how to do something.");
        loDetail.setTransLte("Ibangat");
        loDetail.setInfoxxxx("I will teach you to cook, Bangatan ta ka ya manluto");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Release");
        loDetail.setPrnction("Re-lease");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Allow or enable to escape from confinement; set free.");
        loDetail.setTransLte("Ibulos");
        loDetail.setInfoxxxx("The prisoner was released yesterday, Imbulos da la karuman may preso");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Involve");
        loDetail.setPrnction("In-volve");
        loDetail.setWordType("Verb");
        loDetail.setDescript("(of a situation or event) include (something) as a necessary part or result.");
        loDetail.setTransLte("Damay");
        loDetail.setInfoxxxx("Do not involve me, Agmo ak idadamay");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Beverage");
        loDetail.setPrnction("Be-ve-rage");
        loDetail.setWordType("Noun");
        loDetail.setDescript("Take (a liquid) into the mouth and swallow.");
        loDetail.setTransLte("Iinomen");
        loDetail.setInfoxxxx("Choose a beverage, Manpili kay iinomen");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Bury");
        loDetail.setPrnction("Bu-ry");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Put or hide under ground.");
        loDetail.setTransLte("Ikutkut");
        loDetail.setInfoxxxx("Bury the dead chicken, Ikutkut mo tay inatey ya manok");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Sell");
        loDetail.setPrnction("Sell");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Give or hand over (something) in exchange for money.");
        loDetail.setTransLte("Ilako");
        loDetail.setInfoxxxx("Buy products that you would sell, Mangaliw ka pa ilakom");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Carry along");
        loDetail.setPrnction("Ca-rry-a-long");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Carry something along (with someone) to bring or take something with one; to have something with one and have it handy at all times");
        loDetail.setTransLte("Ilugan");
        loDetail.setInfoxxxx("Carry along the boxes of canned goods, Ilugan mo ira may kahon ya delata");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Fever");
        loDetail.setPrnction("Fe-ver");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A rise of body temperature above the norma");
        loDetail.setTransLte("Petang");
        loDetail.setInfoxxxx("The child has a fever, Manpepetang may ugaw");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Copied");
        loDetail.setPrnction("Co-pied");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Make a similar or identical version of reproduce.");
        loDetail.setTransLte("Inalig");
        loDetail.setInfoxxxx("He copied my answer, Inalig toy sagot ko");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Dead");
        loDetail.setPrnction("Dead");
        loDetail.setWordType("Noun");
        loDetail.setDescript("No longer alive.");
        loDetail.setTransLte("Inatey");
        loDetail.setInfoxxxx("The dead animals, Inatey ya ayep");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Wealth");
        loDetail.setPrnction("Wealth");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The state of being rich,  material prosperity.");
        loDetail.setTransLte("Kayamanan, Yaman");
        loDetail.setInfoxxxx("The dead animals, Inatey ya ayep");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Statement");
        loDetail.setPrnction("S-tate-ment");
        loDetail.setWordType("Noun");
        loDetail.setDescript("A definite or clear expression of something in speech or writing.");
        loDetail.setTransLte("Inbaga");
        loDetail.setInfoxxxx("Base on the statement of the President, Basi ed inbaga ya Presidente");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Where");
        loDetail.setPrnction("Where");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("In or to what place or position.");
        loDetail.setTransLte("Iner");
        loDetail.setInfoxxxx("Where you going?, Iner so laen mo?");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Give away");
        loDetail.setPrnction("Give-a-way");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The act of giving something away free");
        loDetail.setTransLte("Ipakerew");
        loDetail.setInfoxxxx("Give away your old shoes, Ipakerew mo met la tay daan ya sapatos mo");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Lend");
        loDetail.setPrnction("Lend");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Grant to (someone) the use of (something) on the understanding that it will be returned");
        loDetail.setTransLte("Manpabayes, Manpautang");
        loDetail.setInfoxxxx("Lend me your money, Ipaotang mod siyak so kwartam");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Point out");
        loDetail.setPrnction("Point-out");
        loDetail.setWordType("Verb");
        loDetail.setDescript("To direct someones attention to (someone or something) by pointing");
        loDetail.setTransLte("Ituro");
        loDetail.setInfoxxxx("Policeman ask people to go out so that she could point out the suspect, Pinapaway ya pupulis iray totoo piyan naituro to so suspek");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Afternoon");
        loDetail.setPrnction("Af-ter-noon");
        loDetail.setWordType("Noun");
        loDetail.setDescript("The time from noon or lunchtime to evening.");
        loDetail.setTransLte("Ngarim");
        loDetail.setInfoxxxx("I have watch the Afternoon show, Nan bantay ak ya ngarim ya programa");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Love");
        loDetail.setPrnction("lo-ve");
        loDetail.setWordType("Verb");
        loDetail.setDescript("An intense feeling of deep affection.");
        loDetail.setTransLte("Inaro");
        loDetail.setInfoxxxx("I love you, Inaro ta ka");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Evening");
        loDetail.setPrnction("Eve-ning");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("The period of time at the end of the day, usually from about 6 p.m. to bedtime. ");
        loDetail.setTransLte("Labi");
        loDetail.setInfoxxxx("We went out for the evening, Pinmaway kami nen labi");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Indolent");
        loDetail.setPrnction("In-do-lent");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Wanting to avoid activity or exertion; lazy.");
        loDetail.setTransLte("Mangiras");
        loDetail.setInfoxxxx("Indolent person knows nothing, Say mangiras ya too et anggapoy anta to");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Believe");
        loDetail.setPrnction("Be-lieve");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Accept that (something) is true, especially without proof.");
        loDetail.setTransLte("Manisia");
        loDetail.setInfoxxxx("Manisia ak ed sika, I believe in you");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Tired");
        loDetail.setPrnction("Tired");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("In need of sleep or rest; weary.");
        loDetail.setTransLte("Naksawan");
        loDetail.setInfoxxxx("Im so tired in working, Naksawan ak lan mantrabaho");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Drop in");
        loDetail.setPrnction("Drop-in");
        loDetail.setWordType("Noun");
        loDetail.setDescript("To let go of something so that it enters something else");
        loDetail.setTransLte("Samar");
        loDetail.setInfoxxxx("Drop in the station, Samar mo dia ed estasiyon");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Immediately");
        loDetail.setPrnction("Im-me-di-ate-ly");
        loDetail.setWordType("Adjective");
        loDetail.setDescript("Now or without waiting or thinking");
        loDetail.setTransLte("Tampol");
        loDetail.setInfoxxxx("Go to the hospital immediately, Unla ka dia ed ospital ya tampol");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Leave behind");
        loDetail.setPrnction("Leave-be-hind");
        loDetail.setWordType("Verb");
        loDetail.setDescript("To depart (from some place) without bringing someone or something");
        loDetail.setTransLte("Tilak");
        loDetail.setInfoxxxx("I wont leave you behind, Agta ka itilak");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Repeat");
        loDetail.setPrnction("Re-peat");
        loDetail.setWordType("Verb");
        loDetail.setDescript("To say or tell people something more than once");
        loDetail.setTransLte("Oliten, Lamet");
        loDetail.setInfoxxxx("Repeat all the activities, Uliten lamet so gagawen");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("To peel");
        loDetail.setPrnction("To-peel");
        loDetail.setWordType("Verb");
        loDetail.setDescript("To remove the skin or rind from something");
        loDetail.setTransLte("Ubakan");
        loDetail.setInfoxxxx("To peel the banana fruit, Ubakan may ponti");
        loDetail.setDctnryTp(1);
        poList.add(loDetail);

        loDetail = new EDictionaryWords();
        loDetail.setWordName("Keep");
        loDetail.setPrnction("Keep");
        loDetail.setWordType("Verb");
        loDetail.setDescript("Have or retain possession of.");
        loDetail.setTransLte("Isinop, Yatol, Yamot");
        loDetail.setInfoxxxx("Promise to keep my gift, Pangakon ya iyatol mo yay regalok");
        loDetail.setDctnryTp(1);
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
        loTrivia.setWordName("CALASIO");
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
        loTrivia.setInfoxxxx("Manaoag began as a small settlement of Cawili, now the town of San Jacinto, by the banks of Baloquing Creek in the early 1600s.  Some years later, the Augustinian Fathers established a Christian Mission which was originated and regarded as the");
        loList.add(loTrivia);

        return loList;
    }
}

package com.example.plainolnotes.utilities;

import com.example.plainolnotes.model.NoteEntity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class SampleData {

    private static final String SAMPLE_TEXT_1 = "a simple note";
    private static final String SAMPLE_TEXT_2 = "a note with a \nline feed";
    private static final String SAMPLE_TEXT_3 = "lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod long-and vitality, ut labore et dolore magna aliqua. Ut enim ad minim will I come, who shall nostrud exercise, school district labor, but for to aliquip ex ea commodo consequat. Duis, however, cillum pain, pain in the football he wants to be criticized in the cupidatat flee produces no resultant pleasure. Excepteur cupidatat blacks are not excepteur, is soothing to the soul, that is, they deserted the general duties of those who are to blame for your troubles.\n\n "+
            "But I must explain to you how all this mistaken idea of ​denouncing pleasure and praising pain, the whole thing expound the actual teachings of the great truth and the master-builder of human happiness sufficient. None of pleasure itself, because it is pain or avoids, but because encounter consequences that are the pains of those who are to pursue pleasure rationally aware of them. nor Moreover, any person belonging to, those who would calmly ipsum quia dolor sit amet, consectetur, to obtain it wants to, but because they do not never be attached to the modes of the times of the fall so that the labor and sorrow, some great, look for the pleasure. Download information as a vCard E , which of us ever undertakes laborious physical exercise, except to obtain some advantage from it? But who has any right to find fault with him who are in it, a pleasure that has no annoying consequences,or one who avoids a pain that produces no resultant pleasure? ";

    private static Date getDate(int diff){
        GregorianCalendar cal = new GregorianCalendar();
        cal.add(Calendar.MILLISECOND, diff);
        return cal.getTime();
    }

    public static List<NoteEntity> getNotes(){
        List<NoteEntity> notes = new ArrayList<>();
        notes.add(new NoteEntity(1, getDate(0), SAMPLE_TEXT_1));
        notes.add(new NoteEntity(2, getDate(-1), SAMPLE_TEXT_2));
        notes.add(new NoteEntity(3, getDate(-2), SAMPLE_TEXT_3));
        return notes;
    }
}

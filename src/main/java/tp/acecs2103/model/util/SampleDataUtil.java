package tp.acecs2103.model.util;

import tp.acecs2103.model.TaskList;
import tp.acecs2103.model.task.Admin;
import tp.acecs2103.model.task.Description;
import tp.acecs2103.model.task.IP;
import tp.acecs2103.model.task.Index;
import tp.acecs2103.model.task.OfficialDeadline;
import tp.acecs2103.model.task.Remark;
import tp.acecs2103.model.task.TP;
import tp.acecs2103.model.task.Task;
import tp.acecs2103.model.task.Topic;
import tp.acecs2103.model.task.WeekNumber;
import java.time.LocalDate;

import java.time.LocalDate;

/**
 * Contains utility methods for populating {@code TaskList} with sample data.
 */
public class SampleDataUtil {
    public static Task[] getSampleTasks() {
        return new Task[] {
            new Admin(new Index("0101"), new WeekNumber("1"), new Description("Submit pre-lecture quiz"),
                new OfficialDeadline("2020-08-17", LocalDate.of(2020,8,17)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0102"), new WeekNumber("1"), new Description("OOP: Classes & Objects"),
                    new OfficialDeadline("2020-08-14",LocalDate.of(2020,8,14)), null, new Remark("Nothing here"), false, false),
            new Admin(new Index("0103"), new WeekNumber("1"), new Description("Submit the pre-module survey"),
                    new OfficialDeadline("2020-08-14",LocalDate.of(2020,8,14)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0104"), new WeekNumber("1"), new Description("OOP Inheritance"),
                    new OfficialDeadline("2020-08-14",LocalDate.of(2020,8,14)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0105"), new WeekNumber("1"), new Description("OOP: Polymorphism"),
                    new OfficialDeadline("2020-08-14",LocalDate.of(2020,8,14)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0106"), new WeekNumber("1"), new Description("Java: Collections"),
                    new OfficialDeadline("2020-08-14",LocalDate.of(2020,8,14)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0107"), new WeekNumber("1"), new Description("Exception Handling"),
                    new OfficialDeadline("2020-08-14",LocalDate.of(2020,8,14)), null, new Remark("Nothing here"), false, false),
            new Admin(new Index("0108"), new WeekNumber("1"), new Description("Set up the tools"),
                    new OfficialDeadline("2020-08-14",LocalDate.of(2020,8,14)), null, new Remark("Nothing here"), false, false),
            new Admin(new Index("0201"), new WeekNumber("2"), new Description("Submit post-lecture quiz"),
                    new OfficialDeadline("2020-08-20",LocalDate.of(2020,8,20)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0202"), new WeekNumber("2"), new Description("SE: Intro"),
                    new OfficialDeadline("2020-08-20",LocalDate.of(2020,8,20)), null, new Remark("Nothing here"), false, false),
            new IP(new Index("0203"), new WeekNumber("2"), new Description("Learn about the project"),
                    new OfficialDeadline("2020-08-20",LocalDate.of(2020,8,20)), null, new Remark("Nothing here"), false, false),
            new IP(new Index("0204"), new WeekNumber("2"), new Description("Set up prerequisites"),
                    new OfficialDeadline("2020-08-20",LocalDate.of(2020,8,20)), null, new Remark("Nothing here"), false, false),
            new Admin(new Index("0205"), new WeekNumber("2"), new Description("Get connected to our communication channels"),
                    new OfficialDeadline("2020-08-21",LocalDate.of(2020,8,21)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0206"), new WeekNumber("2"), new Description("SDLC Process Models: Basics"),
                    new OfficialDeadline("2020-08-20",LocalDate.of(2020,8,20)), null, new Remark("Nothing here"), false, false),
            new IP(new Index("0207"), new WeekNumber("2"), new Description(" Set up the project in your computer"),
                    new OfficialDeadline("2020-08-20",LocalDate.of(2020,8,20)), null, new Remark("Nothing here"), false, false),
            new IP(new Index("0208"), new WeekNumber("2"), new Description("Add Increments while committing frequently"),
                    new OfficialDeadline("2020-08-20",LocalDate.of(2020,8,20)), null, new Remark("Nothing here"), false, false),
            new Admin(new Index("0301"), new WeekNumber("3"), new Description("Submit post-lecture quiz"),
                    new OfficialDeadline("2020-08-27",LocalDate.of(2020,8,27)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0302"), new WeekNumber("3"), new Description("RCS: Branching"),
                    new OfficialDeadline("2020-08-27",LocalDate.of(2020,8,27)), null, new Remark("Nothing here"), false, false),
            new IP(new Index("0303"), new WeekNumber("3"), new Description("Create a PR to the upstream repo"),
                    new OfficialDeadline("2020-08-27",LocalDate.of(2020,8,27)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("0304"), new WeekNumber("3"), new Description("Get familiar with AB3 features"),
                    new OfficialDeadline("2020-08-27",LocalDate.of(2020,8,27)), null, new Remark("Nothing here"), false, false),
            new Admin(new Index("0305"), new WeekNumber("3"), new Description("[CS2103 students only] Form teams during the tutorial"),
                    new OfficialDeadline("2020-08-27",LocalDate.of(2020,8,27)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0306"), new WeekNumber("3"), new Description("RCS: Creating Pull Requests "),
                    new OfficialDeadline("2020-08-27",LocalDate.of(2020,8,27)), null, new Remark("Nothing here"), false, false),
            new IP(new Index("0307"), new WeekNumber("3"), new Description("Add Increments as parallel branches: Level-7, Level-8"),
                    new OfficialDeadline("2020-08-27",LocalDate.of(2020,8,27)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("0308"), new WeekNumber("3"), new Description("Set up a project meeting time"),
                    new OfficialDeadline("2020-08-27",LocalDate.of(2020,8,27)), null, new Remark("Nothing here"), false, false),
            new IP(new Index("0309"), new WeekNumber("3"), new Description("Add Increments: A-MoreOOP, A-Packages, A-JUnit, A-Jar"),
                        new OfficialDeadline("2020-08-27",LocalDate.of(2020,8,27)), null, new Remark("Nothing here"), false, false),
            new IP(new Index("0310"), new WeekNumber("3"), new Description("Add Increments as parallel branches: A-JavaDoc, A-CodingStandard, Level-9"),
                        new OfficialDeadline("2020-08-27",LocalDate.of(2020,8,27)), null, new Remark("Nothing here"), false, false),
            new Admin(new Index("0401"), new WeekNumber("4"), new Description("Week 4 Admin"),
                    new OfficialDeadline("2020-09-03",LocalDate.of(2020,9,3)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0402"), new WeekNumber("4"), new Description("Week 4 Topic"),
                    new OfficialDeadline("2020-09-03",LocalDate.of(2020,9,3)), null, new Remark("Nothing here"), false, false),
            new IP(new Index("0403"), new WeekNumber("4"), new Description("Week 4 IP"),
                    new OfficialDeadline("2020-09-03",LocalDate.of(2020,9,3)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("0404"), new WeekNumber("4"), new Description("Week 4 TP"),
                    new OfficialDeadline("2020-09-03",LocalDate.of(2020,9,3)), null, new Remark("Nothing here"), false, false),
            new Admin(new Index("0405"), new WeekNumber("4"), new Description("Week 4 Admin"),
                    new OfficialDeadline("2020-09-03",LocalDate.of(2020,9,3)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0406"), new WeekNumber("4"), new Description("Week 4 Topic"),
                    new OfficialDeadline("2020-09-03",LocalDate.of(2020,9,3)), null, new Remark("Nothing here"), false, false),
            new IP(new Index("0407"), new WeekNumber("4"), new Description("Week 4 IP"),
                    new OfficialDeadline("2020-09-03",LocalDate.of(2020,9,3)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("0408"), new WeekNumber("4"), new Description("Week 4 TP"),
                    new OfficialDeadline("2020-09-03",LocalDate.of(2020,9,3)), null, new Remark("Nothing here"), false, false),
            new Admin(new Index("0501"), new WeekNumber("5"), new Description("Week 5 Admin"),
                    new OfficialDeadline("2020-09-10",LocalDate.of(2020,9,10)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0502"), new WeekNumber("5"), new Description("Week 5 Topic"),
                    new OfficialDeadline("2020-09-10",LocalDate.of(2020,9,10)), null, new Remark("Nothing here"), false, false),
            new IP(new Index("0503"), new WeekNumber("5"), new Description("Week 5 IP"),
                    new OfficialDeadline("2020-09-10",LocalDate.of(2020,9,10)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("0504"), new WeekNumber("5"), new Description("Week 5 TP"),
                    new OfficialDeadline("2020-09-10",LocalDate.of(2020,9,10)), null, new Remark("Nothing here"), false, false),
            new Admin(new Index("0505"), new WeekNumber("5"), new Description("Week 5 Admin"),
                    new OfficialDeadline("2020-09-10",LocalDate.of(2020,9,10)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0506"), new WeekNumber("5"), new Description("Week 5 Topic"),
                    new OfficialDeadline("2020-09-10",LocalDate.of(2020,9,10)), null, new Remark("Nothing here"), false, false),
            new IP(new Index("0507"), new WeekNumber("5"), new Description("Week 5 IP"),
                    new OfficialDeadline("2020-09-10",LocalDate.of(2020,9,10)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("0508"), new WeekNumber("5"), new Description("Week 5 TP"),
                    new OfficialDeadline("2020-09-10",LocalDate.of(2020,9,10)), null, new Remark("Nothing here"), false, false),
            new Admin(new Index("0601"), new WeekNumber("6"), new Description("Week 6 Admin"),
                    new OfficialDeadline("2020-09-17",LocalDate.of(2020,9,17)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0602"), new WeekNumber("6"), new Description("Week 6 Topic"),
                    new OfficialDeadline("2020-09-17",LocalDate.of(2020,9,17)), null, new Remark("Nothing here"), false, false),
            new IP(new Index("0603"), new WeekNumber("6"), new Description("Week 6 IP"),
                    new OfficialDeadline("2020-09-17",LocalDate.of(2020,9,17)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("0604"), new WeekNumber("6"), new Description("Week 6 TP"),
                    new OfficialDeadline("2020-09-17",LocalDate.of(2020,9,17)), null, new Remark("Nothing here"), false, false),
            new Admin(new Index("0605"), new WeekNumber("6"), new Description("Week 6 Admin"),
                    new OfficialDeadline("2020-09-17",LocalDate.of(2020,9,17)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0606"), new WeekNumber("6"), new Description("Week 6 Topic"),
                    new OfficialDeadline("2020-09-17",LocalDate.of(2020,9,17)), null, new Remark("Nothing here"), false, false),
            new IP(new Index("0607"), new WeekNumber("6"), new Description("Week 6 IP"),
                    new OfficialDeadline("2020-09-17",LocalDate.of(2020,9,17)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("0608"), new WeekNumber("6"), new Description("Week 6 TP"),
                    new OfficialDeadline("2020-09-17",LocalDate.of(2020,9,17)), null, new Remark("Nothing here"), false, false),
            new Admin(new Index("0701"), new WeekNumber("7"), new Description("Week 7 Admin"),
                    new OfficialDeadline("2020-10-01",LocalDate.of(2020,10,1)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0702"), new WeekNumber("7"), new Description("Week 7 Topic"),
                    new OfficialDeadline("2020-10-01",LocalDate.of(2020,10,1)), null, new Remark("Nothing here"), false, false),
            new IP(new Index("0703"), new WeekNumber("7"), new Description("Week 7 IP"),
                    new OfficialDeadline("2020-09-28",LocalDate.of(2020,9,28)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("0704"), new WeekNumber("7"), new Description("Week 7 TP"),
                    new OfficialDeadline("2020-10-01",LocalDate.of(2020,10,1)), null, new Remark("Nothing here"), false, false),
            new Admin(new Index("0705"), new WeekNumber("7"), new Description("Week 7 Admin"),
                    new OfficialDeadline("2020-10-01",LocalDate.of(2020,10,1)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0706"), new WeekNumber("7"), new Description("Week 7 Topic"),
                    new OfficialDeadline("2020-10-01",LocalDate.of(2020,10,1)), null, new Remark("Nothing here"), false, false),
            new IP(new Index("0707"), new WeekNumber("7"), new Description("Week 7 IP"),
                    new OfficialDeadline("2020-09-28",LocalDate.of(2020,9,28)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("0708"), new WeekNumber("7"), new Description("Week 7 TP"),
                    new OfficialDeadline("2020-10-01",LocalDate.of(2020,10,1)), null, new Remark("Nothing here"), false, false),
            new Admin(new Index("0801"), new WeekNumber("8"), new Description("Week 8 Admin"),
                    new OfficialDeadline("2020-10-09",LocalDate.of(2020,10,9)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0802"), new WeekNumber("8"), new Description("Week 8 Topic"),
                    new OfficialDeadline("2020-10-09",LocalDate.of(2020,10,9)), null, new Remark("Nothing here"), false, false),
            new IP(new Index("0803"), new WeekNumber("8"), new Description("Week 8 IP"),
                    new OfficialDeadline("2020-10-09",LocalDate.of(2020,10,9)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("0804"), new WeekNumber("8"), new Description("Week 8 TP"),
                    new OfficialDeadline("2020-10-09",LocalDate.of(2020,10,9)), null, new Remark("Nothing here"), false, false),
            new Admin(new Index("0805"), new WeekNumber("8"), new Description("Week 8 Admin"),
                    new OfficialDeadline("2020-10-11",LocalDate.of(2020,10,11)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0806"), new WeekNumber("8"), new Description("Week 8 Topic"),
                    new OfficialDeadline("2020-10-09",LocalDate.of(2020,10,9)), null, new Remark("Nothing here"), false, false),
            new IP(new Index("0807"), new WeekNumber("8"), new Description("Week 8 IP"),
                    new OfficialDeadline("2020-10-10",LocalDate.of(2020,10,10)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("0808"), new WeekNumber("8"), new Description("Week 8 TP"),
                    new OfficialDeadline("2020-10-09",LocalDate.of(2020,10,9)), null, new Remark("Nothing here"), false, false),
            new Admin(new Index("0901"), new WeekNumber("9"), new Description("Week 9 Admin"),
                    new OfficialDeadline("2020-10-15",LocalDate.of(2020,10,15)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0902"), new WeekNumber("9"), new Description("Week 9 Topic"),
                    new OfficialDeadline("2020-10-15",LocalDate.of(2020,10,15)), null, new Remark("Nothing here"), false, false),
            new IP(new Index("0903"), new WeekNumber("9"), new Description("Week 9 IP"),
                    new OfficialDeadline("2020-10-15",LocalDate.of(2020,10,15)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("0904"), new WeekNumber("9"), new Description("Week 9 TP"),
                    new OfficialDeadline("2020-10-15",LocalDate.of(2020,10,15)), null, new Remark("Nothing here"), false, false),
            new Admin(new Index("0905"), new WeekNumber("9"), new Description("Week 9 Admin"),
                    new OfficialDeadline("2020-10-15",LocalDate.of(2020,10,15)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0906"), new WeekNumber("9"), new Description("Week 9 Topic"),
                    new OfficialDeadline("2020-10-15",LocalDate.of(2020,10,15)), null, new Remark("Nothing here"), false, false),
            new IP(new Index("0907"), new WeekNumber("9"), new Description("Week 9 IP"),
                    new OfficialDeadline("2020-10-15",LocalDate.of(2020,10,15)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("0908"), new WeekNumber("9"), new Description("Week 9 TP"),
                    new OfficialDeadline("2020-10-15",LocalDate.of(2020,10,15)), null, new Remark("Nothing here"), false, false),
            new Admin(new Index("01001"), new WeekNumber("10"), new Description("Week 10 Admin"),
                    new OfficialDeadline("2020-10-22",LocalDate.of(2020,10,22)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("01002"), new WeekNumber("10"), new Description("Week 10 Topic"),
                    new OfficialDeadline("2020-10-22",LocalDate.of(2020,10,22)), null, new Remark("Nothing here"), false, false),
            new IP(new Index("01003"), new WeekNumber("10"), new Description("Week 10 IP"),
                    new OfficialDeadline("2020-10-22",LocalDate.of(2020,10,22)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("01004"), new WeekNumber("10"), new Description("Week 10 TP"),
                    new OfficialDeadline("2020-10-22",LocalDate.of(2020,10,22)), null, new Remark("Nothing here"), false, false),
            new Admin(new Index("01005"), new WeekNumber("10"), new Description("Week 10 Admin"),
                    new OfficialDeadline("2020-10-22",LocalDate.of(2020,10,22)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("01006"), new WeekNumber("10"), new Description("Week 10 Topic"),
                    new OfficialDeadline("2020-10-22",LocalDate.of(2020,10,22)), null, new Remark("Nothing here"), false, false),
            new IP(new Index("01007"), new WeekNumber("10"), new Description("Week 10 IP"),
                    new OfficialDeadline("2020-10-22",LocalDate.of(2020,10,22)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("01008"), new WeekNumber("10"), new Description("Week 10 TP"),
                    new OfficialDeadline("2020-10-22",LocalDate.of(2020,10,22)), null, new Remark("Nothing here"), false, false),
            new Admin(new Index("01101"), new WeekNumber("11"), new Description("Week 11 Admin"),
                    new OfficialDeadline("2020-10-29",LocalDate.of(2020,10,29)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("01102"), new WeekNumber("11"), new Description("Week 11 Topic"),
                    new OfficialDeadline("2020-10-29",LocalDate.of(2020,10,29)), null, new Remark("Nothing here"), false, false),
            new IP(new Index("01103"), new WeekNumber("11"), new Description("Week 11 IP"),
                    new OfficialDeadline("2020-10-29",LocalDate.of(2020,10,29)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("01104"), new WeekNumber("11"), new Description("Week 11 TP"),
                    new OfficialDeadline("2020-10-29",LocalDate.of(2020,10,29)), null, new Remark("Nothing here"), false, false),
            new Admin(new Index("01105"), new WeekNumber("11"), new Description("Week 11 Admin"),
                    new OfficialDeadline("2020-10-29",LocalDate.of(2020,10,29)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("01106"), new WeekNumber("11"), new Description("Week 11 Topic"),
                    new OfficialDeadline("2020-10-29",LocalDate.of(2020,10,29)), null, new Remark("Nothing here"), false, false),
            new IP(new Index("01107"), new WeekNumber("11"), new Description("Week 11 IP"),
                    new OfficialDeadline("2020-10-29",LocalDate.of(2020,10,29)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("01108"), new WeekNumber("11"), new Description("Week 11 TP"),
                    new OfficialDeadline("2020-10-29",LocalDate.of(2020,10,29)), null, new Remark("Nothing here"), false, false),
            new Admin(new Index("01201"), new WeekNumber("12"), new Description("Week 12 Admin"),
                    new OfficialDeadline("2020-11-06",LocalDate.of(2020,11,6)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("01202"), new WeekNumber("12"), new Description("Week 12 Topic"),
                    new OfficialDeadline("2020-11-06",LocalDate.of(2020,11,6)), null, new Remark("Nothing here"), false, false),
            new IP(new Index("01203"), new WeekNumber("12"), new Description("Week 12 IP"),
                    new OfficialDeadline("2020-11-06",LocalDate.of(2020,11,6)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("01204"), new WeekNumber("12"), new Description("Week 12 TP"),
                    new OfficialDeadline("2020-11-06",LocalDate.of(2020,11,6)), null, new Remark("Nothing here"), false, false),
            new Admin(new Index("01205"), new WeekNumber("12"), new Description("Week 12 Admin"),
                    new OfficialDeadline("2020-11-06",LocalDate.of(2020,11,6)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("01206"), new WeekNumber("12"), new Description("Week 12 Topic"),
                    new OfficialDeadline("2020-11-06",LocalDate.of(2020,11,6)), null, new Remark("Nothing here"), false, false),
            new IP(new Index("01207"), new WeekNumber("12"), new Description("Week 12 IP"),
                    new OfficialDeadline("2020-11-06",LocalDate.of(2020,11,6)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("01208"), new WeekNumber("12"), new Description("Week 12 TP"),
                    new OfficialDeadline("2020-11-06",LocalDate.of(2020,11,6)), null, new Remark("Nothing here"), false, false),
            new Admin(new Index("01301"), new WeekNumber("13"), new Description("Week 13 Admin"),
                    new OfficialDeadline("2020-11-12",LocalDate.of(2020,11,12)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("01302"), new WeekNumber("13"), new Description("Week 13 Topic"),
                    new OfficialDeadline("2020-11-11",LocalDate.of(2020,11,11)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("01303"), new WeekNumber("13"), new Description("Week 13 IP"),
                    new OfficialDeadline("2020-11-09",LocalDate.of(2020,11,9)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("01304"), new WeekNumber("13"), new Description("Week 13 TP"),
                    new OfficialDeadline("2020-11-11",LocalDate.of(2020,11,11)), null, new Remark("Nothing here"), false, false),
            new Admin(new Index("01305"), new WeekNumber("13"), new Description("Week 13 Admin"),
                    new OfficialDeadline("2020-11-11",LocalDate.of(2020,11,11)), null, new Remark ("Nothing here"), false, false),
            new Topic(new Index("01306"), new WeekNumber("13"), new Description("Week 13 Topic"),
                    new OfficialDeadline("2020-11-11",LocalDate.of(2020,11,11)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("01307"), new WeekNumber("13"), new Description("Week 13 IP"),
                    new OfficialDeadline("2020-11-10",LocalDate.of(2020,11,10)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("01308"), new WeekNumber("13"), new Description("Week 13 TP"),
                    new OfficialDeadline("2020-11-11", LocalDate.of(2020,11,11)), null, new Remark("Nothing here"), false, false),
        };
    }

    public static TaskList getSampleTaskList() {
        TaskList sampleTaskList = new TaskList();
        for (Task sampleTask : getSampleTasks()) {
            sampleTaskList.add(sampleTask);
        }
        return sampleTaskList;
    }
}

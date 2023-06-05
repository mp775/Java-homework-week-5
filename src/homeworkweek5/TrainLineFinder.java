package homeworkweek5;

import java.util.*;

/** 10. Write a programme that tells you which line passes through particular stations.
 Just use Zone 1 stations name. */

public class TrainLineFinder {
    private Map<String, Set<String>> trainLines;

    public TrainLineFinder() {
        trainLines = new HashMap<>();
    }

    // instance method that allow to add train lines and their corresponding stations to the map
    public void addTrainLine(String lineName, String... stations) {
        if (!trainLines.containsKey(lineName)) {
            trainLines.put(lineName, new HashSet<>());
        }
        Set<String> lineStations = trainLines.get(lineName);
        for (String station : stations) {
            lineStations.add(station);
        }
    }

    // instance method that takes a station as input and returns a set of train lines that pass through that station
    public Set<String> getTrainLinesForStation(String station) {
        Set<String> result = new HashSet<>();
        for (Map.Entry<String, Set<String>> entry : trainLines.entrySet()) {
            String lineName = entry.getKey();
            Set<String> lineStations = entry.getValue();
            if (lineStations.contains(station)) {
                result.add(lineName);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TrainLineFinder finder = new TrainLineFinder();  // creating an instance of 'TrainLindFinder'
        // adding train lines and stations using instance
        finder.addTrainLine("Jubilee Line", "London Bridge", "Southwark", "Waterloo", "Westminster", "Green Park", "Bond Street", "Backer Street");
        finder.addTrainLine("Central Line", "Liverpool Street", "Tottenham Court Road", "Bank", "St Paul's", "Chancery Lane", "Holborn", "Oxford Circus", "Bond Street", "Lancaster Gate", "Marble Arch", "Queensway", "Notting Hill Gate");
        finder.addTrainLine("Piccadilly Line", "Earl's Court", "South Kensington", "Gloucester Road", "Knightsbridge", "Hyde Park Corner", "Green Park", "Piccadilly Circus", "Leicester Square", "Covent Garden", "Holborn", "Russell Square", "King's Cross", "King's Cross & St Pancras Internatioal");
        finder.addTrainLine("District Line", "Aldgate East", "Tower Hill", "Monument", "Bank", "Cannon Street", "Mansion House", "Blackfriars", "Temple", "Embankment", "St James's Park", "Victoria", "Sloane Square", "South Kensington", "Earl's Court", "High Street Kensington", "Notting Hill Gate", "Bayswater", "Paddington", "Edgware Road");
        finder.addTrainLine("Victoria Line", "King's Cross", "King's Cross & St Pancras International", "Euston", "Wareen Street", "Oxford Circus", "Green Park", "Victoria", "Pimlico", "Vauxhall");
        finder.addTrainLine("Hammersmith & City Line","Edgware Road", "Baker Street", "Great Portland Street", "Euston Square", "King's Cross", "St Pancras International", "Farringdon", "Barbican", "Moorgate", "Aldgate East");
        finder.addTrainLine("Circle Line", "Edgware Road", "Paddington", "Bayswater", "Notting Hill Gate", "High Street Kensington", "South Kensington", "Sloane Square", "St James's Park", "Embankment", "Temple", "Blackfriars", "Mansion House", "Cannon Street", "Monument", "Tower Hill", "Aldgate", "Liverpool Street", "Moorgate", "Barbican", "Farringdon", "King's Cross", "King's Cross & St Pancras International", "Euston Square", "Great Portland Street", "Baker Street");
        finder.addTrainLine("Bakerloo Line", "Edgware Road", "Marylebone", "Baker Street", "Regent's Park", "Oxford Circus", "Leicester Square", "Charing Cross", "Embankment", "Waterloo", "Lambeth North", "Elephant & Castle");
        finder.addTrainLine("Northern Line", "King's Cross", "King Cross & St Pancras International", "Euston", "Euston Squre", "Angle", "Old Street", "Bank", "Battersea Power Station", "Battersea", "Borough", "Charing Cross", "Elephant & Castle", "Embankment", "Goodge Street", "Leicester Square", "London Bridge", "Moorgate", "Nine Elms", "Old Street", "Tottenham Court Road","Warren Street");
        finder.addTrainLine("Metropolitan Line", "Aldgate", "Baker Street", "Barbican", "Euston Square", "Farringdon", "Great Portland Street", "King's Cross", "King Cross & St Pancras International", "Liverpool Street", "Moorgate");
        finder.addTrainLine("Waterloo & City", "Waterloo", "Bank");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Station Name: ");
        String station = scanner.nextLine();
        Set<String> lines = finder.getTrainLinesForStation(station);

        if (lines.isEmpty()) {
            System.out.println("No train lines pass through " + station);
        } else {
            System.out.println("Train lines passing through " + station + ":");
            for (String line : lines) {
                System.out.println(line);
            }
        }
    }
}

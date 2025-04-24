import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> map = new HashMap<>();
        Map<String, List<Song>> map2 = new HashMap<>();
        for (int i=0; i<genres.length; i++) {
            String str = genres[i];
            map.put(str, map.getOrDefault(str,0)+plays[i]);
            map2.putIfAbsent(str, new ArrayList<>());
            map2.get(str).add(new Song(i, plays[i]));
        }
        // map value기준 정렬한 key List
        List<String> sortedGenres = new ArrayList<>(map.keySet());
        // Collections.sort()나 List.sort()는 함수형 인터페이스
        sortedGenres.sort((g1, g2) -> map.get(g2) - map.get(g1));
        
        List<Integer> result = new ArrayList<>();

        // 장르 내 재생횟수에 따라 정렬
        for (String genre : sortedGenres) {
            List<Song> songs = map2.get(genre);
            songs.sort((s1, s2) -> {
                if (s2.plays == s1.plays) {
                    return s1.id - s2.id; // 고유번호 오름차순
                }
                return s2.plays - s1.plays; // 재생수 내림차순
            });

            result.add(songs.get(0).id); // 가장 많이 재생된 노래
            if (songs.size() > 1) {
                result.add(songs.get(1).id); // 두 번째로 많이 재생된 노래
            }
        }
        int[] answer = new int[result.size()];
        int index = 0;
        for (int n : result) {
            answer[index++] = n;
        }

        return answer;
    }
    private static class Song {
        private int id;
        private int plays;
        public Song(int id, int plays) {
            this.id=id;
            this.plays=plays;
        }
    }
}
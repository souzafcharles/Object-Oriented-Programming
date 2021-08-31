package souza.charles;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {

        Scanner photoAlbum = new Scanner(System.in);
        int photoAlbumHeightPage;
        int photoAlbumWidthPage;
        int heightPhotoA;
        int widthPhotoA;
        int heightPhotoB;
        int widthPhotoB;

        photoAlbumHeightPage = photoAlbum.nextInt();
        photoAlbumWidthPage = photoAlbum.nextInt();
        heightPhotoA = photoAlbum.nextInt();
        widthPhotoA = photoAlbum.nextInt();
        heightPhotoB = photoAlbum.nextInt();
        widthPhotoB = photoAlbum.nextInt();

        if (widthPhotoA + heightPhotoB <= photoAlbumWidthPage && heightPhotoB <= photoAlbumHeightPage && heightPhotoA <= photoAlbumHeightPage) {
            System.out.println("S");
        } else if (photoAlbumWidthPage >= widthPhotoA &&  widthPhotoB <= photoAlbumWidthPage && heightPhotoA + heightPhotoB <= photoAlbumHeightPage) {
            System.out.println("S");

        } else if (photoAlbumWidthPage >= widthPhotoA + heightPhotoB && photoAlbumHeightPage >= heightPhotoA && photoAlbumHeightPage >= widthPhotoB) {
            System.out.println("S");
        } else if (photoAlbumWidthPage >= widthPhotoB + heightPhotoA && photoAlbumHeightPage >= widthPhotoA && photoAlbumHeightPage >= heightPhotoB) {
            System.out.println("S");

        } else if (heightPhotoA <= photoAlbumWidthPage && widthPhotoB <= photoAlbumWidthPage && widthPhotoA + heightPhotoB <= photoAlbumHeightPage) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
    }
}

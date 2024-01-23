package io.github.msufred.tailwindcolors;

import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

import static io.github.msufred.tailwindcolors.Colors.*;

public final class Backgrounds {

    // SLATE
    public static final Background BG_SLATE_50 = createBackground(SLATE_50);
    public static final Background BG_SLATE_100 = createBackground(SLATE_100);
    public static final Background BG_SLATE_200 = createBackground(SLATE_200);
    public static final Background BG_SLATE_300 = createBackground(SLATE_300);
    public static final Background BG_SLATE_400 = createBackground(SLATE_400);
    public static final Background BG_SLATE_500 = createBackground(SLATE_500);
    public static final Background BG_SLATE_600 = createBackground(SLATE_600);
    public static final Background BG_SLATE_700 = createBackground(SLATE_700);
    public static final Background BG_SLATE_800 = createBackground(SLATE_800);
    public static final Background BG_SLATE_900 = createBackground(SLATE_900);
    public static final Background BG_SLATE_950 = createBackground(SLATE_950);

    // GRAY
    public static final Background BG_GRAY_50 = createBackground(GRAY_50);
    public static final Background BG_GRAY_100 = createBackground(GRAY_100);
    public static final Background BG_GRAY_200 = createBackground(GRAY_200);
    public static final Background BG_GRAY_300 = createBackground(GRAY_300);
    public static final Background BG_GRAY_400 = createBackground(GRAY_400);
    public static final Background BG_GRAY_500 = createBackground(GRAY_500);
    public static final Background BG_GRAY_600 = createBackground(GRAY_600);
    public static final Background BG_GRAY_700 = createBackground(GRAY_700);
    public static final Background BG_GRAY_800 = createBackground(GRAY_800);
    public static final Background BG_GRAY_900 = createBackground(GRAY_900);
    public static final Background BG_GRAY_950 = createBackground(GRAY_950);

    // ZINC
    public static final Background BG_ZINC_50 = createBackground(ZINC_50);
    public static final Background BG_ZINC_100 = createBackground(ZINC_100);
    public static final Background BG_ZINC_200 = createBackground(ZINC_200);
    public static final Background BG_ZINC_300 = createBackground(ZINC_300);
    public static final Background BG_ZINC_400 = createBackground(ZINC_400);
    public static final Background BG_ZINC_500 = createBackground(ZINC_500);
    public static final Background BG_ZINC_600 = createBackground(ZINC_600);
    public static final Background BG_ZINC_700 = createBackground(ZINC_700);
    public static final Background BG_ZINC_800 = createBackground(ZINC_800);
    public static final Background BG_ZINC_900 = createBackground(ZINC_900);
    public static final Background BG_ZINC_950 = createBackground(ZINC_950);

    // NEUTRAL
    public static final Background BG_NEUTRAL_50 = createBackground(NEUTRAL_50);
    public static final Background BG_NEUTRAL_100 = createBackground(NEUTRAL_100);
    public static final Background BG_NEUTRAL_200 = createBackground(NEUTRAL_200);
    public static final Background BG_NEUTRAL_300 = createBackground(NEUTRAL_300);
    public static final Background BG_NEUTRAL_400 = createBackground(NEUTRAL_400);
    public static final Background BG_NEUTRAL_500 = createBackground(NEUTRAL_500);
    public static final Background BG_NEUTRAL_600 = createBackground(NEUTRAL_600);
    public static final Background BG_NEUTRAL_700 = createBackground(NEUTRAL_700);
    public static final Background BG_NEUTRAL_800 = createBackground(NEUTRAL_800);
    public static final Background BG_NEUTRAL_900 = createBackground(NEUTRAL_900);
    public static final Background BG_NEUTRAL_950 = createBackground(NEUTRAL_950);

    // STONE
    public static final Background BG_STONE_50 = createBackground(STONE_50);
    public static final Background BG_STONE_100 = createBackground(STONE_100);
    public static final Background BG_STONE_200 = createBackground(STONE_200);
    public static final Background BG_STONE_300 = createBackground(STONE_300);
    public static final Background BG_STONE_400 = createBackground(STONE_400);
    public static final Background BG_STONE_500 = createBackground(STONE_500);
    public static final Background BG_STONE_600 = createBackground(STONE_600);
    public static final Background BG_STONE_700 = createBackground(STONE_700);
    public static final Background BG_STONE_800 = createBackground(STONE_800);
    public static final Background BG_STONE_900 = createBackground(STONE_900);
    public static final Background BG_STONE_950 = createBackground(STONE_950);

    // RED

    private static Background createBackground(Color color) {
        return new Background(new BackgroundFill(color, CornerRadii.EMPTY, Insets.EMPTY));
    }

}

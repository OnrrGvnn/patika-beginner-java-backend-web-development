/* Write a program in Java that determines the zodiac sign based on the entered month and day. */

package conditionalstatements;

import java.util.Scanner;

public class ZodiacSignFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* int dayNumber;
        int monthNumber;
        String zodiacSign = "";
        boolean isError = false;

        System.out.print("\nEnter The Month Of Birth : ");
        monthNumber = input.nextInt();
        System.out.print("Enter The Day Of Birth : ");
        dayNumber = input.nextInt();

        switch (monthNumber) {
            case 1:
                if (dayNumber >= 1 && dayNumber <= 31) {
                    if (dayNumber <= 21) {
                        zodiacSign = "Capricorn";
                    } else {
                        zodiacSign = "Aquarius";
                    }
                } else {
                    isError = true;
                }
                break;
            case 2:
                if (dayNumber >= 1 && dayNumber <= 28) {
                    if (dayNumber <= 19) {
                        zodiacSign = "Aquarius";
                    } else {
                        zodiacSign = "Pisces";
                    }
                } else {
                    isError = true;
                }
                break;
            case 3:
                if (dayNumber >= 1 && dayNumber <= 31) {
                    if (dayNumber <= 20) {
                        zodiacSign = "Pisces";
                    } else {
                        zodiacSign = "Aries";
                    }
                } else {
                    isError = true;
                }
                break;
            case 4:
                if (dayNumber >= 1 && dayNumber <= 30) {
                    if (dayNumber <= 20) {
                        zodiacSign = "Aries";
                    } else {
                        zodiacSign = "Taurus";
                    }
                } else {
                    isError = true;
                }
                break;
            case 5:
                if (dayNumber >= 1 && dayNumber <= 31) {
                    if (dayNumber <= 21) {
                        zodiacSign = "Taurus";
                    } else {
                        zodiacSign = "Gemini";
                    }
                } else {
                    isError = true;
                }
                break;
            case 6:
                if (dayNumber >= 1 && dayNumber <= 30) {
                    if (dayNumber <= 22) {
                        zodiacSign = "Gemini";
                    } else {
                        zodiacSign = "Cancer";
                    }
                } else {
                    isError = true;
                }
                break;
            case 7:
                if (dayNumber >= 1 && dayNumber <= 31) {
                    if (dayNumber <= 22) {
                        zodiacSign = "Cancer";
                    } else {
                        zodiacSign = "Leo";
                    }
                } else {
                    isError = true;
                }
                break;
            case 8:
                if (dayNumber >= 1 && dayNumber <= 31) {
                    if (dayNumber <= 22) {
                        zodiacSign = "Leo";
                    } else {
                        zodiacSign = "Virgo";
                    }
                } else {
                    isError = true;
                }
                break;
            case 9:
                if (dayNumber >= 1 && dayNumber <= 30) {
                    if (dayNumber <= 22) {
                        zodiacSign = "Virgo";
                    } else {
                        zodiacSign = "Libra";
                    }
                } else {
                    isError = true;
                }
                break;
            case 10:
                if (dayNumber >= 1 && dayNumber <= 31) {
                    if (dayNumber <= 22) {
                        zodiacSign = "Libra";
                    } else {
                        zodiacSign = "Scorpio";
                    }
                } else {
                    isError = true;
                }
                break;
            case 11:
                if (dayNumber >= 1 && dayNumber <= 30) {
                    if (dayNumber <= 21) {
                        zodiacSign = "Scorpio";
                    } else {
                        zodiacSign = "Sagittarius";
                    }
                } else {
                    isError = true;
                }
                break;
            case 12:
                if (dayNumber >= 1 && dayNumber <= 31) {
                    if (dayNumber <= 21) {
                        zodiacSign = "Sagittarius";
                    } else {
                        zodiacSign = "Capricorn";
                    }
                } else {
                    isError = true;
                }
                break;
            default:
                isError = true;
        }

        if (isError) {
            System.out.print("\nYou Made An Invalid Entry. Please Try Again!\n");
        } else {
            System.out.print("\nYour Zodiac Sign : " + zodiacSign + "\n");
        } */

        int dayNumber;
        int monthNumber;
        String zodiacSign = "";
        boolean isError = false;

        System.out.print("\nEnter The Month Of Birth : ");
        monthNumber = input.nextInt();
        System.out.print("Enter The Day Of Birth : ");
        dayNumber = input.nextInt();

        if (monthNumber == 1) {
            if (dayNumber >= 1 && dayNumber <= 31) {
                if (dayNumber <= 21) {
                    zodiacSign = "Capricorn";
                } else {
                    zodiacSign = "Aquarius";
                }
            } else {
                isError = true;
            }
        } else if (monthNumber == 2) {
            if (dayNumber >= 1 && dayNumber <= 28) {
                if (dayNumber <= 19) {
                    zodiacSign = "Aquarius";
                } else {
                    zodiacSign = "Pisces";
                }
            } else {
                isError = true;
            }
        } else if (monthNumber == 3) {
            if (dayNumber >= 1 && dayNumber <= 31) {
                if (dayNumber <= 20) {
                    zodiacSign = "Pisces";
                } else {
                    zodiacSign = "Aries";
                }
            } else {
                isError = true;
            }
        } else if (monthNumber == 4) {
            if (dayNumber >= 1 && dayNumber <= 30) {
                if (dayNumber <= 20) {
                    zodiacSign = "Aries";
                } else {
                    zodiacSign = "Taurus";
                }
            } else {
                isError = true;
            }
        } else if (monthNumber == 5) {
            if (dayNumber >= 1 && dayNumber <= 31) {
                if (dayNumber <= 21) {
                    zodiacSign = "Taurus";
                } else {
                    zodiacSign = "Gemini";
                }
            } else {
                isError = true;
            }
        } else if (monthNumber == 6) {
            if (dayNumber >= 1 && dayNumber <= 30) {
                if (dayNumber <= 22) {
                    zodiacSign = "Gemini";
                } else {
                    zodiacSign = "Cancer";
                }
            } else {
                isError = true;
            }
        } else if (monthNumber == 7) {
            if (dayNumber >= 1 && dayNumber <= 31) {
                if (dayNumber <= 22) {
                    zodiacSign = "Cancer";
                } else {
                    zodiacSign = "Leo";
                }
            } else {
                isError = true;
            }
        } else if (monthNumber == 8) {
            if (dayNumber >= 1 && dayNumber <= 31) {
                if (dayNumber <= 22) {
                    zodiacSign = "Leo";
                } else {
                    zodiacSign = "Virgo";
                }
            } else {
                isError = true;
            }
        } else if (monthNumber == 9) {
            if (dayNumber >= 1 && dayNumber <= 30) {
                if (dayNumber <= 22) {
                    zodiacSign = "Virgo";
                } else {
                    zodiacSign = "Libra";
                }
            } else {
                isError = true;
            }
        } else if (monthNumber == 10) {
            if (dayNumber >= 1 && dayNumber <= 31) {
                if (dayNumber <= 22) {
                    zodiacSign = "Libra";
                } else {
                    zodiacSign = "Scorpio";
                }
            } else {
                isError = true;
            }
        } else if (monthNumber == 11) {
            if (dayNumber >= 1 && dayNumber <= 30) {
                if (dayNumber <= 21) {
                    zodiacSign = "Scorpio";
                } else {
                    zodiacSign = "Sagittarius";
                }
            } else {
                isError = true;
            }
        } else if (monthNumber == 12) {
            if (dayNumber >= 1 && dayNumber <= 31) {
                if (dayNumber <= 21) {
                    zodiacSign = "Sagittarius";
                } else {
                    zodiacSign = "Capricorn";
                }
            } else {
                isError = true;
            }
        } else {
            isError = true;
        }

        if (isError) {
            System.out.print("\nYou Made An Invalid Entry. Please Try Again!\n");
        } else {
            System.out.print("\nYour Zodiac Sign : " + zodiacSign + "\n");
        }

    }
}